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

public class ParsingUtils {
        /**
     * Parses all Java files in a directory and returns a list of pairs: file path and CompilationUnit.
     *
     * @param directory The root directory containing Java source files.
     * @return List of Pair<AbsolutePath, CompilationUnit> for all successfully parsed files.
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
     * Configures a CombinedTypeSolver with Reflection and source directories.
     *
     * @param packagePaths Set of package paths for JavaParserTypeSolver.
     * @return CombinedTypeSolver configured with all dependencies.
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
     * Finds all unique package directories containing Java files under a root directory.
     *
     * @param rootPath Root directory to search for Java files.
     * @return Set of package directories.
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
     * @param javaFile Path to a Java source file.
     * @param rootPath Root directory of the project.
     * @return Path to the package directory containing the file, or empty string if not found.
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