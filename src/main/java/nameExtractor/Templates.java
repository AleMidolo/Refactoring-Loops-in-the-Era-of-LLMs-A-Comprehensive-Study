package nameExtractor;

import java.util.Arrays;
import java.util.List;

/**
 * Utility class to check if a list of statement types matches predefined templates.
 */
public class Templates {

    // Define templates as static constants to avoid recreating them each time
    private static final List<String> TEMPLATE_1 = Arrays.asList("IfStmt", "ReturnStmt", "EndIfStmt");
    private static final List<String> TEMPLATE_2 = Arrays.asList("VariableDeclaration", "IfStmt", "ReturnStmt", "EndIfStmt");
    private static final List<String> TEMPLATE_3 = Arrays.asList("VariableDeclaration", "IfStmt", "MethodCall", "EndIfStmt");
    private static final List<String> TEMPLATE_4 = Arrays.asList("VariableDeclaration", "MethodCall");
    private static final List<String> TEMPLATE_5 = Arrays.asList("IfStmt", "MethodCall", "EndIfStmt", "ElseStmt", "MethodCall", "EndElseStmt");
    private static final List<String> TEMPLATE_6 = Arrays.asList("IfStmt", "VariableDeclaration", "EndIfStmt", "ElseStmt", "VariableDeclaration", "EndElseStmt");

    /**
     * Checks if the given list of statement types matches the first template.
     */
    public static boolean checkFirstTemplate(List<String> statements) {
        return TEMPLATE_1.equals(statements);
    }

    /**
     * Checks if the given list of statement types matches the second template.
     */
    public static boolean checkSecondTemplate(List<String> statements) {
        return TEMPLATE_2.equals(statements);
    }

    /**
     * Checks if the given list of statement types matches the third template.
     */
    public static boolean checkThirdTemplate(List<String> statements) {
        return TEMPLATE_3.equals(statements);
    }

    /**
     * Checks if the given list of statement types matches the fourth template.
     */
    public static boolean checkFourthTemplate(List<String> statements) {
        return TEMPLATE_4.equals(statements);
    }

    /**
     * Checks if the given list of statement types matches the fifth template.
     */
    public static boolean checkFifthTemplate(List<String> statements) {
        return TEMPLATE_5.equals(statements);
    }

    /**
     * Checks if the given list of statement types matches the sixth template.
     */
    public static boolean checkSixthTemplate(List<String> statements) {
        return TEMPLATE_6.equals(statements);
    }

    /**
     * Generic method to check any template dynamically.
     *
     * @param statements The statements to check
     * @param template   The template to compare against
     * @return true if statements match the template exactly
     */
    public static boolean checkTemplate(List<String> statements, List<String> template) {
        return template.equals(statements);
    }
}