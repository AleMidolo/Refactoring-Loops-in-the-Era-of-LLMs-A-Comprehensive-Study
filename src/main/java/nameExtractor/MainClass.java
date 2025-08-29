package nameExtractor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.utils.Pair;

import static nameExtractor.ParsingUtils.*;
import static nameExtractor.Utils.*;
import static nameExtractor.MavenUtils.*;


public class MainClass {
	
	// Base project directory (relative to current working directory)
	public static String baseDirectory = System.getProperty("user.dir");

	// Subdirectories
	public static String repositoriesDirectory = baseDirectory + File.separator + "AnalyzedRepositories";
	public static String streamDirectory = baseDirectory + File.separator + "Results" + File.separator + "GENERATED";
	public static String printPath = "";
	public static String repoName = "";
	public static String repoSingleName = "";

	// Counters for statistics
	public static AtomicInteger less = new AtomicInteger(0);
	public static AtomicInteger more = new AtomicInteger(0);
	public static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) throws IOException {

		// Read repository names from file
		HashSet<String> repos = readMethodsFromFile(Paths.get(baseDirectory + "\\repositories.txt"));

		// Process each repository
		for (String repo : repos) {
			processRepository(repo);
		}
	}

	/**
	 * Processes a single repository: parses files, extracts loops, categorizes and refactors.
	 *
	 * @param repo Repository name.
	 */
	private static void processRepository(String repo) {
		repoSingleName = repo;
		repoName = repositoriesDirectory + "\\" + repo;

		printPath = baseDirectory + "\\Results\\CATEGORIES\\" + repo;
		System.out.println("Processing repository: " + repoName);

		createDirectory(printPath);

		// Parse all Java files in the repository
		List<Pair<String, CompilationUnit>> parseResult = parse(repoName);

		List<ForStmt> forStmts = new ArrayList<>();
		List<ForEachStmt> forEachStmts = new ArrayList<>();

		try {
			System.out.println("Analysis started");

			parseResult.forEach(pr -> {
				CompilationUnit cu = pr.b;
				String absolutePath = pr.a.replace(repoName, "");

				// Generate a safe filename for categorization
				String filename = absolutePath.replace("\\", ".").replace(":", "");

				// Extract loops
				HashSet<ForStmt> classicFor = Visitors.extractForStmt(cu);
				HashSet<ForEachStmt> advancedFor = Visitors.extractForEachStmt(cu);

				forStmts.addAll(classicFor);
				forEachStmts.addAll(advancedFor);

				// Categorize loops based on your rules
				categorizeFor(filename, classicFor, advancedFor);
			});

			// Apply refactoring to all extracted loops, this step should be done after the for loop are refactored with the LLM model
			refactorFor();

			System.out.println("Analysis terminated! \nNow you can check methods informations..");

		} catch (Exception e) {
			System.err.println("Error during repository analysis: " + repoName);
			e.printStackTrace();
		}

		// Print summary statistics
		printRepositoryStatistics(forStmts.size(), forEachStmts.size());
	}

	/**
	 * Prints loop analysis summary for a repository.
	 *
	 * @param forStmtCount Number of classic ForStmt loops.
	 * @param forEachStmtCount Number of advanced ForEachStmt loops.
	 */
	private static void printRepositoryStatistics(int forStmtCount, int forEachStmtCount) {
		System.out.println("Number of ForStmt: " + forStmtCount);
		System.out.println("Number of ForEachStmt: " + forEachStmtCount + "\n");
		System.out.println("Number of Less: " + less + "\n");
		System.out.println("Number of More: " + more + "\n");
		System.out.println("Number of count: " + count + "\n");
	}

	
	/**
	 * Refactors Java for-loops and for-each statements in source files using provided transformation data.
	 * Reads compilable files, locates target statements by line number, replaces them with the transformed code,
	 * and attempts to compile them while preserving the original files.
	 *
	 * @param forStmts List to store processed traditional for statements (currently unused in this method)
	 * @param forEachStmts List to store processed for-each statements (currently unused in this method)
	 */
	private static void refactorFor() {
		try (Stream<Path> paths = Files.walk(Paths.get(streamDirectory))) {
			List<Path> javaFiles = paths
					.filter(Files::isRegularFile)
					.filter(p -> p.toString().endsWith(".java"))
					.toList();

			HashSet<String> compilableFiles = loadCompilableFiles();

			for (Path transformationFile : javaFiles) {
				processTransformationFile(transformationFile, compilableFiles);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads the list of compilable files from the predefined result text file.
	 *
	 * @return Set of compilable file names with "compile_" prefix removed.
	 * @throws IOException if reading the file fails
	 */
	private static HashSet<String> loadCompilableFiles() throws IOException {
		String txtFilePath = baseDirectory + File.separator + "Results" + File.separator + repoSingleName + ".txt";
	    return readMethodsFromFile(Paths.get(txtFilePath))
	            .stream()
	            .map(s -> s.replace("compile_", ""))
	            .collect(Collectors.toCollection(HashSet::new));
	}

	/**
	 * Processes a single transformation file by locating the corresponding source Java file,
	 * replacing the target for-loop/for-each statement with the new stream-based code, and
	 * compiling the modified file.
	 *
	 * @param transformationFile Path to the file containing transformed code
	 * @param compilableFiles Set of compilable files to filter against
	 */
	private static void processTransformationFile(Path transformationFile, Set<String> compilableFiles) {
		try {
			// Extract line number and original file name from transformation file
			String[] parts = transformationFile.getFileName().toString().split("_", 2);
			int lineNumber = Integer.parseInt(parts[0]);
			String originalFileName = parts[1];

			String sourceFilePath = buildSourceFilePath(repoName, originalFileName);
			String code = Files.readString(Paths.get(sourceFilePath));

			CompilationUnit cu;
			try {
				cu = StaticJavaParser.parse(code);
			} catch (ParseProblemException e) {
				return; // Skip files that cannot be parsed
			}

			Optional<ForStmt> forStmt = cu.findAll(ForStmt.class).stream()
					.filter(f -> f.getBegin().map(pos -> pos.line == lineNumber).orElse(false))
					.findFirst();

			Optional<ForEachStmt> forEachStmt = cu.findAll(ForEachStmt.class).stream()
					.filter(f -> f.getBegin().map(pos -> pos.line == lineNumber).orElse(false))
					.findFirst();

			String streamCode = Files.readString(transformationFile);
			streamCode = streamCode.substring(0, streamCode.length() - 1);

			if (forStmt.isPresent()) {
				forStmt.get().replace(new ExpressionStmt(new NameExpr(streamCode)));
			} else if (forEachStmt.isPresent()) {
				forEachStmt.get().replace(new ExpressionStmt(new NameExpr(streamCode)));
			}

			String copyPath = buildTempCopyPath(sourceFilePath);
			String outputPath = baseDirectory + "\\Results\\MVN_OUTPUT\\" 
					+ repoSingleName + "\\compile_" + (lineNumber + "_" + originalFileName);

			if (Files.exists(Paths.get(outputPath))) return;

			compileAndRestoreFile(repoName, sourceFilePath, cu, copyPath, outputPath);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Categorizes traditional for-loops and for-each statements in a given file.
	 * For each statement, it extracts individual statements, increments the global count,
	 * and applies labelling logic.
	 *
	 * @param filename     Original file name
	 * @param forStmts     Set of traditional for statements
	 * @param forEachStmts Set of for-each statements
	 */
	private static void categorizeFor(String filename, HashSet<ForStmt> forStmts, HashSet<ForEachStmt> forEachStmts) {
	    // Process traditional for-loops
	    for (ForStmt f : forStmts) {
	        processLoopStatement(f, filename);
	    }

	    // Process for-each loops
	    for (ForEachStmt f : forEachStmts) {
	        processLoopStatement(f, filename);
	    }
	}

	/**
	 * Helper method to process a single loop statement: extract line number, statements,
	 * increment counter, and apply labelling.
	 *
	 * @param loopStmt Statement to process (ForStmt or ForEachStmt)
	 * @param filename Original file name
	 */
	private static void processLoopStatement(Statement loopStmt, String filename) {
	    int lineNumber = loopStmt.getBegin().map(pos -> pos.line).orElse(-1);
	    if (lineNumber == -1) return; // Skip statements without position

	    // Prefix the original file name with the line number
	    String newFilename = lineNumber + "_" + filename;

	    // Extract statements from the loop using Utils helper
		ArrayList<String> statements;
		if (loopStmt.isForStmt()) {
			statements = getStatements(loopStmt.asForStmt());
		} else if (loopStmt.isForEachStmt()) {
			statements = getStatements(loopStmt.asForEachStmt());
		} else {
			statements = new ArrayList<>();
		}

	    // Increment global counter
	    count.incrementAndGet();

	    // Apply labelling logic
	    labelling(loopStmt, statements, newFilename);
	}

	
	/**
	 * Labels a given loop statement based on its characteristics and templates.
	 * Creates corresponding directories and writes the statement to files for each label.
	 *
	 * @param loopStmt   The loop statement to be labeled
	 * @param statements List of statement types inside the loop (e.g., "ReturnStmt", "TryStmt")
	 * @param filename   The filename to use when saving the labeled statement
	 */
	private static void labelling(Statement loopStmt, ArrayList<String> statements, String filename) {

	    // Label by size
	    if (statements.size() > 5) {
	        incrementAndWrite(loopStmt, filename, more, "SIZE_MORE");
	    } else {
	        incrementAndWrite(loopStmt, filename, less, "SIZE_LESS");
	    }

	    // Label if local variables are missing
	    if (!checkLocalVars(loopStmt)) {
	        writeToCategory(loopStmt, filename, "LOCALVARS");
	    }

	    // Label by control flow statements
	    if (statements.contains("TryStmt") || statements.contains("CatchClause") || statements.contains("ThrowStmt")) {
	        writeToCategory(loopStmt, filename, "THROWCLAUSE");
	    }
	    if (statements.contains("BreakStmt")) {
	        writeToCategory(loopStmt, filename, "BREAK");
	    }
	    if (statements.contains("ContinueStmt")) {
	        writeToCategory(loopStmt, filename, "CONTINUE");
	    }

	    // Label by return statements
	    long returnCount = statements.stream().filter(s -> s.equals("ReturnStmt")).count();
	    if (returnCount == 1) {
	        writeToCategory(loopStmt, filename, "ONERETURN");
	    } else if (returnCount > 1) {
	        writeToCategory(loopStmt, filename, "MORERETURN");
	    }

	    // Label by nested loops
	    if (statements.contains("ForStmt") || statements.contains("ForEachStmt") || statements.contains("WhileStmt")) {
	        writeToCategory(loopStmt, filename, "NESTEDLOOP");
	    }

	    // Label by switch statement
	    if (statements.contains("SwitchStmt")) {
	        writeToCategory(loopStmt, filename, "SWITCH");
	    }

	    // Label by templates
	    if (Templates.checkFirstTemplate(statements)) {
	        writeToCategory(loopStmt, filename, "1stTEMPLATE");
	    }
	    if (Templates.checkSecondTemplate(statements)) {
	        writeToCategory(loopStmt, filename, "2ndTEMPLATE");
	    }
	    if (Templates.checkThirdTemplate(statements)) {
	        writeToCategory(loopStmt, filename, "3rdTEMPLATE");
	    }
	    if (Templates.checkFourthTemplate(statements)) {
	        writeToCategory(loopStmt, filename, "4thTEMPLATE");
	    }
	    if (Templates.checkFifthTemplate(statements) || Templates.checkSixthTemplate(statements)) {
	        writeToCategory(loopStmt, filename, "5thTEMPLATE");
	    }
	}

	/**
	 * Increments the given counter and writes the loop statement to the specified category.
	 *
	 * @param loopStmt  The loop statement to write
	 * @param filename  Filename for saving
	 * @param counter   Atomic counter to increment
	 * @param category  Category folder name
	 */
	private static void incrementAndWrite(Statement loopStmt, String filename, AtomicInteger counter, String category) {
	    counter.incrementAndGet();
	    writeToCategory(loopStmt, filename, category);
	}

	/**
	 * Creates the directory for the category if it doesn't exist and writes the statement to a file.
	 *
	 * @param loopStmt The loop statement to write
	 * @param filename Filename for saving
	 * @param category Category folder name
	 */
	private static void writeToCategory(Statement loopStmt, String filename, String category) {
	    String dirPath = printPath + "\\" + category;
	    createDirectory(dirPath);
	    writeOnFile(loopStmt, dirPath + "\\" + filename);
	}

	
	/**
	 * Checks whether a loop statement contains only local variable assignments.
	 * It returns true if there is at most one assignment outside the declared variables.
	 *
	 * @param stmt The loop statement to check
	 * @return true if all assignments are local or at most one non-local assignment, false otherwise
	 */
	private static boolean checkLocalVars(Statement stmt) {
	    // Extract declared variables and assignments
	    HashSet<String> decls = new HashSet<>();
	    HashSet<String> assignments = new HashSet<>();

	    if (stmt.isForStmt()) {
	        decls = Visitors.extractVariables(stmt.asForStmt());
	        assignments = Visitors.extractAssignments(stmt.asForStmt());
	        assignments.addAll(Visitors.extractUnaries(stmt.asForStmt()));
	    } else if (stmt.isForEachStmt()) {
	        decls = Visitors.extractVariables(stmt.asForEachStmt());
	        assignments = Visitors.extractAssignments(stmt.asForEachStmt());
	        assignments.addAll(Visitors.extractUnaries(stmt.asForEachStmt()));
	    }

	    // Remove variables that are declared locally
	    assignments.removeAll(decls);

	    // Return true if at most one assignment is non-local
	    return assignments.size() <= 1;
	}
}