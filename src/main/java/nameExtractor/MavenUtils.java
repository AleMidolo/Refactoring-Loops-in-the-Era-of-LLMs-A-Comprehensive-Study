package nameExtractor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.github.javaparser.ast.CompilationUnit;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.StandardCopyOption;

import static nameExtractor.Utils.createDirectory;
import static nameExtractor.MainClass.baseDirectory;

/**
 * Utility class providing methods for handling Maven-related file operations,
 * including path construction, temporary copies for compilation, and compiling
 * Java source files while preserving the original file.
 */
public class MavenUtils {

    /**
     * Builds the full source file path for a Java file based on the repository name
     * and the original file name. Replaces dots in package names with directory
     * separators to create a proper file path.
     *
     * @param repoName         the name of the repository where the file is located
     * @param originalFileName the original Java source file name including package
     *                         notation (e.g., com.example.MyClass.java)
     * @return the full file system path for the source file
     */
    public static String buildSourceFilePath(String repoName, String originalFileName) {
        String filename = repoName + originalFileName;
        int lastDotIndex = filename.lastIndexOf(".");
        String beforeLastDot = filename.substring(0, lastDotIndex).replaceAll("\\.", "\\\\");
        String afterLastDot = filename.substring(lastDotIndex);
        return beforeLastDot + afterLastDot;
    }

    /**
     * Builds a temporary copy path for a Java source file. This path is used to
     * create a backup copy of the original file before compilation or modification.
     *
     * @param sourceFilePath the full path of the source file to create a temporary copy for
     * @return the file system path of the temporary copy
     */
    public static String buildTempCopyPath(String sourceFilePath) {
        int nameIndex = sourceFilePath.lastIndexOf("\\");
        String name = sourceFilePath.substring(nameIndex);
        return baseDirectory + "\\Results\\TMP_COPY" + name;
    }

    /**
     * Compiles a Java source file and restores the original file after compilation.
     * This method performs the following steps:
     * <ol>
     *     <li>Makes a temporary copy of the original source file.</li>
     *     <li>Overwrites the original file with the modified CompilationUnit content.</li>
     *     <li>Creates the output directory if it does not exist.</li>
     *     <li>Runs the Maven compile command.</li>
     *     <li>Restores the original source file from the temporary copy and deletes the temporary copy.</li>
     * </ol>
     *
     * @param repoName       the name of the repository containing the source file
     * @param sourceFilePath the full path to the source file to be compiled
     * @param cu             the CompilationUnit representing the Java source code
     * @param copyPath       the path where the temporary copy of the source file is stored
     * @param outputPath     the path to store compilation results (e.g., class files)
     * @throws IOException if any I/O operation fails (file copy, deletion, or writing)
     */
    public static void compileAndRestoreFile(String repoName, String sourceFilePath, CompilationUnit cu,
                                             String copyPath, String outputPath) throws IOException {
        System.out.println("Starting the compiling and test process");

        Files.copy(Paths.get(sourceFilePath), Paths.get(copyPath), StandardCopyOption.REPLACE_EXISTING);

        try (FileWriter writer = new FileWriter(sourceFilePath)) {
            writer.write(cu.toString());
        }

        System.out.println("File has been overwritten successfully.\n" + sourceFilePath + "\n");

        createDirectory(Paths.get(outputPath).getParent().toString());
        runCommand(repoName, "compile", outputPath);

        Files.copy(Paths.get(copyPath), Paths.get(sourceFilePath), StandardCopyOption.REPLACE_EXISTING);
        Files.delete(Paths.get(copyPath));
    }

    	/**
	 * Executes a Maven command in the repository directory and writes both console output
	 * and command results to the specified output file.
	 *
	 * @param command    Maven command to execute (e.g., "compile", "test")
	 * @param outputPath File path where the Maven output will be appended
	 */
	public static void runCommand(String repoName, String command, String outputPath) {
	    ProcessBuilder processBuilder = new ProcessBuilder(
            //replace with your mvn path
	            "C:\\Users\\Ale-m\\Desktop\\apache-maven-3.8.5\\bin\\mvn.cmd", command
	    );

	    // Set the working directory to the repository folder
	    processBuilder.directory(new File(repoName));

	    System.out.println("MVN process Started: " + command);

	    try {
	        Process process = processBuilder.start();

	        // Read process output and simultaneously write it to the file
	        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	             FileWriter fileWriter = new FileWriter(outputPath, true)) { // Append mode

	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);                   // Print to console
	                fileWriter.write(line + System.lineSeparator()); // Write to file
	            }
	        }

	        int exitCode = process.waitFor(); // Wait for process to complete
	        if (exitCode == 0) {
	            System.out.println("Maven command executed successfully. Output written to: " + outputPath);
	        } else {
	            System.out.println("Maven command failed with exit code: " + exitCode);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}