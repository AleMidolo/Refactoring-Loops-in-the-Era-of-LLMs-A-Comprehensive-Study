package nameExtractor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import com.github.javaparser.utils.Pair;
import com.github.javaparser.utils.SourceRoot;

/**
 * Utility class providing methods to parse Java source files, configure
 * symbol solving, and discover package directories for a project.
 * Includes:
 * <ul>
 *     <li>Parsing Java files into CompilationUnits</li>
 *     <li>Configuring CombinedTypeSolver with reflection and source packages</li>
 *     <li>Finding package directories containing Java files</li>
 * </ul>
 */
public class ParsingUtils {

    /**
     * Parses all Java files in a given root directory and returns a list of pairs
     * containing the absolute file path and the corresponding CompilationUnit.
     *
     * @param directory the root directory containing Java source files
     * @return a list of Pair (String, CompilationUnit) representing each successfully parsed file
     */
    public static List<Pair<String, CompilationUnit>> parse(String directory) {
        HashSet<String> packagePaths = findPackageDirectories(directory);

        CombinedTypeSolver combinedSolver = configureSymbolSolver(packagePaths);
        ParserConfiguration parserConfiguration = new ParserConfiguration()
                .setSymbolResolver(new JavaSymbolSolver(combinedSolver))
                .setAttributeComments(false);

        System.out.println("Symbol Solver configured...");
        System.out.println("Parsing all paths started...");
        System.out.println("\n" + packagePaths + "\n");

        List<Pair<String, CompilationUnit>> results = new ArrayList<>();

        for (String path : packagePaths) {
            System.out.println("Parsing path: " + path);
            try {
                SourceRoot sourceRoot = new SourceRoot(Paths.get(path), parserConfiguration);

                // Parse each file in the path without saving changes
                sourceRoot.parse("", (_, absolutePath, result) -> {
                    if (result.isSuccessful()) {
                        CompilationUnit cu = result.getResult().orElseThrow();
                        results.add(new Pair<>(absolutePath.toString(), cu));
                    }
                    return SourceRoot.Callback.Result.DONT_SAVE;
                });

            } catch (Exception e) {
                System.err.println("Error parsing path: " + path);
                e.printStackTrace();
            }
        }

        System.out.println("Parsing terminated!");
        return results;
    }

    /**
     * Configures a CombinedTypeSolver for symbol resolution using the standard
     * JDK classes and the given set of package directories.
     *
     * @param packagePaths a set of package directory paths containing Java source files
     * @return a CombinedTypeSolver configured with reflection and source directories
     */
    public static CombinedTypeSolver configureSymbolSolver(HashSet<String> packagePaths) {
        CombinedTypeSolver combinedSolver = new CombinedTypeSolver();

        try {
            // Add reflection solver for standard JDK classes
            combinedSolver.add(new ReflectionTypeSolver());

            // Add a solver for each source package
            for (String path : packagePaths) {
                combinedSolver.add(new JavaParserTypeSolver(new File(path)));
            }

        } catch (Exception e) {
            System.err.println("Error configuring symbol solver:");
            e.printStackTrace();
        }

        return combinedSolver;
    }

    /**
     * Finds all unique package directories containing Java files under a specified root directory.
     *
     * @param rootPath the root directory to search for Java files
     * @return a HashSet of package directory paths
     */
    public static HashSet<String> findPackageDirectories(String rootPath) {
        System.out.println("Starting package search...");

        HashSet<String> paths = new HashSet<>();
        try (Stream<Path> stream = Files.walk(Paths.get(rootPath))) {

            paths = stream.filter(Files::isRegularFile)
                          .filter(p -> p.toString().endsWith(".java"))
                          .map(p -> extractPackageDirectory(p, rootPath))
                          .filter(s -> !s.isEmpty())
                          .collect(Collectors.toCollection(HashSet::new));

        } catch (IOException e) {
            System.err.println("Error walking directory: " + rootPath);
            e.printStackTrace();
        }

        System.out.println("Package search completed.");
        return paths;
    }

    /**
     * Extracts the directory path of a Java file’s package.
     *
     * @param javaFile the path to a Java source file
     * @param rootPath the root directory of the project
     * @return the path to the package directory containing the file, or an empty string if not found
     */
    private static String extractPackageDirectory(Path javaFile, String rootPath) {
        try {
            String absolutePath = javaFile.toFile().getAbsolutePath();
            CompilationUnit cu = StaticJavaParser.parse(javaFile);

            if (cu.getPackageDeclaration().isEmpty()) return "";

            String packageName = cu.getPackageDeclaration().get().getNameAsString();
            if (packageName.length() <= 1) return "";

            packageName = packageName.replace(".", "\\");
            absolutePath = absolutePath.replace(rootPath, "");
            absolutePath = absolutePath.replace(javaFile.getFileName().toString(), "");

            return rootPath + absolutePath.replace("\\" + packageName, "");

        } catch (Exception e) {
            System.err.println("Error parsing file: " + javaFile);
            e.printStackTrace();
        }
        return "";
    }
}