package nameExtractor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.ArrayList;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.Statement;


/**
 * General utility methods for file handling, directory management, and
 * analyzing Java statements using JavaParser.
 */
public class Utils{
    /**
     * Reads a file and returns all lines as a set of strings.
     *
     * @param path Path to the file containing method names or other entries.
     * @return Set of strings, one for each line in the file.
     * @throws IOException if the file cannot be read.
     */
    public static HashSet<String> readMethodsFromFile(Path path) throws IOException {
        return new HashSet<>(Files.readAllLines(path));
    }

    	/**
	 * Writes the string representation of a statement to a file.
	 *
	 * @param stmt The statement to write
	 * @param path The full path of the file to create/write
	 */
	public static void writeOnFile(Statement stmt, String path) {
	    try (FileWriter writer = new FileWriter(path)) { // try-with-resources auto-closes the writer
	        writer.write(stmt.toString());
	    } catch (IOException e) {
	        System.err.println("Error creating or writing to the file: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

	/**
	 * Creates a directory if it does not already exist.
	 *
	 * @param dirPath The full path of the directory to create
	 */
	public static void createDirectory(String dirPath) {
	    File directory = new File(dirPath);
	    if (!directory.exists()) {  // Only create if it doesn't exist
	        boolean created = directory.mkdirs(); // Use mkdirs() to create parent directories if needed
	        if (created) {
	            System.out.println("Directory created successfully at: " + dirPath);
	        } else {
	            System.err.println("Failed to create directory at: " + dirPath);
	        }
	    }
	}

    /**
     * Extracts the sequence of statement types from a classic for-loop.
     *
     * @param fs The ForStmt to analyze
     * @return An ArrayList of Strings representing statement types inside the loop
     */
    public static ArrayList<String> getStatements(ForStmt fs) {
        ArrayList<String> nodes = new ArrayList<>();
        fs.getBody().removeComment();           // Remove comments to avoid parsing interference
        evaluateBlock(nodes, fs.getBody());    // Recursively evaluate block statements
        return nodes;
    }

    /**
     * Extracts the sequence of statement types from an enhanced for-each loop.
     *
     * @param fes The ForEachStmt to analyze
     * @return An ArrayList of Strings representing statement types inside the loop
     */
    public static ArrayList<String> getStatements(ForEachStmt fes) {
        ArrayList<String> nodes = new ArrayList<>();
        fes.getBody().removeComment();          // Remove comments to avoid parsing interference
        evaluateBlock(nodes, fes.getBody());   // Recursively evaluate block statements
        return nodes;
    }

    /**
     * Recursively traverses a block or statement and adds the type of each statement
     * to the provided list.
     *
     * @param pos The list of statement types
     * @param n   The current Statement node to evaluate
     */
    public static void evaluateBlock(ArrayList<String> pos, Statement n) {
        try {
            if (n.isBlockStmt()) {
                n.asBlockStmt().getStatements().forEach(s -> evaluateBlock(pos, s));
            } else if (n.isAssertStmt()) {
                pos.add("AssertStmt");
            } else if (n.isBreakStmt()) {
                pos.add("BreakStmt");
            } else if (n.isContinueStmt()) {
                pos.add("ContinueStmt");
            } else if (n.isDoStmt()) {
                pos.add("StartDoWhile");
                evaluateBlock(pos, n.asDoStmt().getBody());
                pos.add("DoStmt");
            } else if (n.isExpressionStmt()) {
                pos.add(checkExpression(n.asExpressionStmt().getExpression()));
            } else if (n.isExplicitConstructorInvocationStmt()) {
                pos.add("ExplicitConstructorInvocationStmt");
            } else if (n.isForEachStmt()) {
                pos.add("ForEachStmt");
                evaluateBlock(pos, n.asForEachStmt().getBody());
                pos.add("EndForEachStmt");
            } else if (n.isForStmt()) {
                pos.add("ForStmt");
                evaluateBlock(pos, n.asForStmt().getBody());
                pos.add("EndForStmt");
            } else if (n.isIfStmt()) {
                pos.add("IfStmt");
                evaluateBlock(pos, n.asIfStmt().getThenStmt());
                pos.add("EndIfStmt");
                n.asIfStmt().getElseStmt().ifPresent(elseStmt -> {
                    pos.add("ElseStmt");
                    evaluateBlock(pos, elseStmt);
                    pos.add("EndElseStmt");
                });
            } else if (n.isLabeledStmt()) {
                pos.add("LabeledStmt");
            } else if (n.isLocalClassDeclarationStmt()) {
                pos.add("LocalClassDeclarationStmt");
            } else if (n.isLocalRecordDeclarationStmt()) {
                pos.add("LocalRecordDeclarationStmt");
            } else if (n.isReturnStmt()) {
                pos.add("ReturnStmt");
            } else if (n.isSwitchStmt()) {
                pos.add("SwitchStmt");
                n.asSwitchStmt().getEntries().forEach(entry -> {
                    entry.getStatements().forEach(stmt -> evaluateBlock(pos, stmt));
                });
                pos.add("EndSwitchStmt");
            } else if (n.isSynchronizedStmt()) {
                pos.add("SynchronizedStmt");
                evaluateBlock(pos, n.asSynchronizedStmt().getBody());
                pos.add("EndSynchronizedStmt");
            } else if (n.isThrowStmt()) {
                pos.add("ThrowStmt");
            } else if (n.isTryStmt()) {
                pos.add("TryStmt");
                evaluateBlock(pos, n.asTryStmt().getTryBlock());
                pos.add("EndTryStmt");

                n.asTryStmt().getCatchClauses().forEach(catchClause -> {
                    pos.add("CatchClause");
                    evaluateBlock(pos, catchClause.getBody());
                    pos.add("EndCatchClause");
                });

                n.asTryStmt().getFinallyBlock().ifPresent(finallyBlock -> {
                    pos.add("FinallyStmt");
                    evaluateBlock(pos, finallyBlock);
                    pos.add("EndFinallyStmt");
                });
            } else if (n.isWhileStmt()) {
                pos.add("WhileStmt");
                evaluateBlock(pos, n.asWhileStmt().getBody());
                pos.add("EndWhileStmt");
            } else if (n.isYieldStmt()) {
                pos.add("YieldStmt");
            } else if (!n.isEmptyStmt()) {
                throw new Exception("Unrecognized statement: " + n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns a string label for a given Expression node.
     *
     * @param e The expression to classify
     * @return A string describing the type of expression
     */
    public static String checkExpression(Expression e) {
        if (e.isAnnotationExpr()) return "Annotation";
        if (e.isArrayAccessExpr()) return "ArrayAccess";
        if (e.isArrayCreationExpr()) return "ArrayCreation";
        if (e.isArrayInitializerExpr()) return "ArrayInit";
        if (e.isAssignExpr()) return "Assign";
        if (e.isBinaryExpr()) return "Binary";
        if (e.isBooleanLiteralExpr()) return "BooleanLiteral";
        if (e.isCastExpr()) return "Cast";
        if (e.isCharLiteralExpr()) return "CharLiteral";
        if (e.isClassExpr()) return "ClassExpr";
        if (e.isConditionalExpr()) return "Conditional";
        if (e.isDoubleLiteralExpr()) return "DoubleLiteral";
        if (e.isEnclosedExpr()) return "Enclosed";
        if (e.isFieldAccessExpr()) return "FieldAccess";
        if (e.isInstanceOfExpr()) return "InstanceOf";
        if (e.isIntegerLiteralExpr()) return "IntegerLiteral";
        if (e.isLambdaExpr()) return "Lambda";
        if (e.isLiteralExpr()) return "Literal";
        if (e.isLiteralStringValueExpr()) return "LiteralStringValue";
        if (e.isLongLiteralExpr()) return "LongLiteral";
        if (e.isMethodCallExpr()) return "MethodCall";
        if (e.isMethodReferenceExpr()) return "MethodReference";
        if (e.isNameExpr()) return "NameExpr";
        if (e.isNullLiteralExpr()) return "NullLiteral";
        if (e.isObjectCreationExpr()) return "ObjectCreation";
        if (e.isPatternExpr()) return "PatternExpr";
        if (e.isPolyExpression()) return "PolyExpr";
        if (e.isStringLiteralExpr()) return "StringLiteral";
        if (e.isSuperExpr()) return "Super";
        if (e.isSwitchExpr()) return "Switch";
        if (e.isTextBlockLiteralExpr()) return "TextBlock";
        if (e.isThisExpr()) return "This";
        if (e.isTypeExpr()) return "TypeExpr";
        if (e.isUnaryExpr()) return "Unary";
        if (e.isVariableDeclarationExpr()) return "VariableDeclaration";
        return "StandAloneExpression";  // default for unrecognized expressions
    }
}