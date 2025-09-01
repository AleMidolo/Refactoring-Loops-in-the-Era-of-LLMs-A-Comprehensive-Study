package nameExtractor;

import java.util.HashSet;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.ArrayAccessExpr;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.expr.UnaryExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ForEachStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Utility class containing various JavaParser visitors to collect specific AST elements.
 * <p>
 * This class provides visitors for:
 * <ul>
 *     <li>For loops (<code>ForStmt</code>)</li>
 *     <li>For-each loops (<code>ForEachStmt</code>)</li>
 *     <li>Variable names (<code>NameExpr</code> and <code>SimpleName</code>)</li>
 *     <li>Variable declarations (<code>VariableDeclarator</code>)</li>
 *     <li>Unary expressions (<code>UnaryExpr</code>)</li>
 *     <li>Assignments (<code>AssignExpr</code>)</li>
 * </ul>
 * <p>
 * Provides helper methods to extract these elements from <code>CompilationUnit</code> or
 * specific statements.
 * </p>
 */
public class Visitors {

/**
 * Visitor to collect all traditional for-loops (ForStmt) in a compilation unit or block.
 */
public static class CollectForStmt extends VoidVisitorAdapter<HashSet<ForStmt>> {
    /**
     * Visits a traditional for-loop and adds it to the set.
     *
     * @param ne the for-loop node to visit
     * @param allNames the set to collect all visited for-loop nodes
     */
    @Override
    public void visit(ForStmt ne, HashSet<ForStmt> allNames) {
	        super.visit(ne, allNames);
	        allNames.add(ne);
	    }
	}

	/**
	 * Visitor to collect all enhanced for-each loops (ForEachStmt) in a compilation unit or block.
	 */
	public static class CollectForEachStmt extends VoidVisitorAdapter<HashSet<ForEachStmt>> {
	    /**
	     * Visits a for-each loop and adds it to the set.
	     *
	     * @param md the for-each loop node to visit
	     * @param methods the set to collect all visited for-each loop nodes
	     */
	    @Override
	    public void visit(ForEachStmt md, HashSet<ForEachStmt> methods) {
	        super.visit(md, methods);
	        methods.add(md);
	    }
	}

	/**
	 * Visitor to collect all variable references (NameExpr) in a block or statement.
	 */
	public static class CollectNames extends VoidVisitorAdapter<HashSet<NameExpr>> {
	    /**
	     * Visits a variable reference and adds it to the set.
	     *
	     * @param ne the NameExpr node to visit
	     * @param names the set to collect all visited NameExpr nodes
	     */
	    @Override
	    public void visit(NameExpr ne, HashSet<NameExpr> names) {
	        super.visit(ne, names);
	        names.add(ne);
	    }
	}

	/**
	 * Visitor to collect all simple identifiers (SimpleName) in the AST.
	 */
	public static class CollectSimpleNames extends VoidVisitorAdapter<HashSet<SimpleName>> {
	    /**
	     * Visits a simple name and adds it to the set.
	     *
	     * @param ne the SimpleName node to visit
	     * @param names the set to collect all visited SimpleName nodes
	     */
	    @Override
	    public void visit(SimpleName ne, HashSet<SimpleName> names) {
	        super.visit(ne, names);
	        names.add(ne);
	    }
	}

	/**
	 * Visitor to collect variable names from variable declarations.
	 */
	public static class CollectVariable extends VoidVisitorAdapter<HashSet<String>> {
	    /**
	     * Visits a variable declaration and adds its name to the set.
	     *
	     * @param vd the variable declaration node to visit
	     * @param variables the set to collect all variable names
	     */
	    @Override
	    public void visit(VariableDeclarator vd, HashSet<String> variables) {
	        super.visit(vd, variables);
	        variables.add(vd.getNameAsString());
	    }
	}

	/**
	 * Visitor to collect variables involved in unary expressions.
	 * <p>
	 * Handles field access, array access, and normal variable references. 
	 * Skips logical NOT (!) operations.
	 * </p>
	 */
	public static class CollectUnary extends VoidVisitorAdapter<HashSet<String>> {
	    /**
	     * Visits a unary expression and adds the involved variable names to the set.
	     *
	     * @param ue the unary expression node to visit
	     * @param exprs the set to collect all variable names involved in unary expressions
	     */
	    @Override
	    public void visit(UnaryExpr ue, HashSet<String> exprs) {
	        super.visit(ue, exprs);

	        if (ue.getOperator() == UnaryExpr.Operator.LOGICAL_COMPLEMENT) return;

	        if (ue.getExpression().isFieldAccessExpr()) {
	            handleFieldAccessExpr(ue.getExpression().asFieldAccessExpr(), exprs);
	        } 
	        else if (ue.getExpression().isArrayAccessExpr()) {
	            handleArrayAccessExpr(ue.getExpression().asArrayAccessExpr(), exprs);
	        } 
	        else if (ue.getExpression().isNameExpr()) {
	            exprs.add(ue.getExpression().toString());
	        }
	    }
	}

	/**
	 * Visitor to collect variable assignments.
	 * <p>
	 * Supports field access, array access, and regular variable assignments.
	 * </p>
	 */
	public static class CollectAssignments extends VoidVisitorAdapter<HashSet<String>> {
	    /**
	     * Visits an assignment expression and adds the target variable to the set.
	     *
	     * @param ae the assignment expression node to visit
	     * @param assignments the set to collect all assigned variable names
	     */
	    @Override
	    public void visit(AssignExpr ae, HashSet<String> assignments) {
	        super.visit(ae, assignments);

	        if (ae.getTarget().isFieldAccessExpr()) {
	            handleFieldAccessExpr(ae.getTarget(), assignments);
	        } 
	        else if (ae.getTarget().isArrayAccessExpr()) {
	            handleArrayAccessExpr(ae.getTarget().asArrayAccessExpr(), assignments);
	        } 
	        else if (ae.getTarget().isNameExpr()) {
	            assignments.add(ae.getTarget().toString());
	        }
	    }
	}

	/**
	 * Recursively handles array access expressions to extract variable names.
	 *
	 * @param aae the ArrayAccessExpr node to process
	 * @param assignments the set to collect variable names
	 */
	private static void handleArrayAccessExpr(ArrayAccessExpr aae, HashSet<String> assignments) {
	    if (aae.getName().isNameExpr()) {
	        assignments.add(aae.getName().toString());
	    } 
	    else if (aae.getName().isFieldAccessExpr()) {
	        handleFieldAccessExpr(aae.getName(), assignments);
	    } 
	    else if (aae.getName().isArrayAccessExpr()) {
	        handleArrayAccessExpr(aae.getName().asArrayAccessExpr(), assignments);
	    }
	}

	/**
	 * Recursively handles field access expressions to extract variable names.
	 * <p>
	 * Traverses nested expressions such as method calls, field accesses, and array accesses.
	 * Example: obj.field.method()[i] -> collects "obj".
	 * </p>
	 *
	 * @param e the Expression node to process
	 * @param assignments the set to collect variable names
	 */
	private static void handleFieldAccessExpr(Expression e, HashSet<String> assignments) {
	    Expression expr = e;

	    while (!expr.isNameExpr()) {
	        if (expr.isFieldAccessExpr()) {
	            expr = expr.asFieldAccessExpr().getScope();
	        } 
	        else if (expr.isMethodCallExpr()) {
	            if (expr.asMethodCallExpr().getScope().isPresent())
	                expr = expr.asMethodCallExpr().getScope().get();
	            else return;
	        } 
	        else if (expr.isArrayAccessExpr()) {
	            if (expr.asArrayAccessExpr().getName().isNameExpr()) {
	                assignments.add(expr.asArrayAccessExpr().getName().toString());
	                return;
	            } else {
	                expr = expr.asArrayAccessExpr().getName();
	            }
	        } 
	        else return;
	    }

	    if (expr.isNameExpr()) {
	        assignments.add(expr.asNameExpr().getNameAsString());
	    }
	}

    // ==============================
    // Convenience extraction methods
    // ==============================

	/**
	 * Extracts all traditional for-loops (for statements) from a given compilation unit.
	 *
	 * @param cu the CompilationUnit representing the parsed Java source file
	 * @return a HashSet containing all ForStmt nodes found in the compilation unit
	 */
	public static HashSet<ForStmt> extractForStmt(CompilationUnit cu) {
	    VoidVisitor<HashSet<ForStmt>> collectFor = new CollectForStmt();
	    HashSet<ForStmt> forStmts = new HashSet<>();
	    collectFor.visit(cu, forStmts);
	    return forStmts;
	}

	/**
	 * Extracts all for-each loops (enhanced for statements) from a given compilation unit.
	 *
	 * @param cu the CompilationUnit representing the parsed Java source file
	 * @return a HashSet containing all ForEachStmt nodes found in the compilation unit
	 */
	public static HashSet<ForEachStmt> extractForEachStmt(CompilationUnit cu) {
	    VoidVisitor<HashSet<ForEachStmt>> collectForEach = new CollectForEachStmt();
	    HashSet<ForEachStmt> forEachStmts = new HashSet<>();
	    collectForEach.visit(cu, forEachStmts);
	    return forEachStmts;
	}

	/**
	 * Extracts all NameExpr nodes (variable references) from a given block statement.
	 *
	 * @param bs the BlockStmt representing a block of code (e.g., method body)
	 * @return a HashSet containing all NameExpr nodes found within the block
	 */
	public static HashSet<NameExpr> extractNames(BlockStmt bs) {
	    VoidVisitor<HashSet<NameExpr>> collectNames = new CollectNames();
	    HashSet<NameExpr> names = new HashSet<>();
	    collectNames.visit(bs, names);
	    return names;
	}

	/**
	 * Extracts all SimpleName nodes (identifiers) from a given block statement.
	 *
	 * @param bs the BlockStmt representing a block of code (e.g., method body)
	 * @return a HashSet containing all SimpleName nodes found within the block
	 */
	public static HashSet<SimpleName> extractSimpleNames(BlockStmt bs) {
	    VoidVisitor<HashSet<SimpleName>> collectNames = new CollectSimpleNames();
	    HashSet<SimpleName> names = new HashSet<>();
	    collectNames.visit(bs, names);
	    return names;
	}

	/**
	 * Extracts variable names declared within a for-each loop.
	 *
	 * @param f the ForEachStmt node representing the for-each loop
	 * @return a HashSet containing the names of all variables declared in the loop
	 */
	public static HashSet<String> extractVariables(ForEachStmt f) {
	    VoidVisitor<HashSet<String>> collectVariables = new CollectVariable();
	    HashSet<String> variables = new HashSet<>();
	    collectVariables.visit(f, variables);
	    return variables;
	}
		
	/**
	 * Extracts all variable names declared within a traditional for-loop.
	 *
	 * @param f the ForStmt node representing the for-loop to analyze
	 * @return a HashSet containing the names of all variables declared in the loop
	 */
	public static HashSet<String> extractVariables(ForStmt f) {
	    VoidVisitor<HashSet<String>> collectVariables = new CollectVariable();
	    HashSet<String> variables = new HashSet<>();
	    collectVariables.visit(f, variables);
	    return variables;
	}

	/**
	 * Extracts all variables that are assigned values within a foreach-loop.
	 *
	 * @param f the ForEachStmt node representing the foreach-loop to analyze
	 * @return a HashSet containing the names of all assigned variables within the loop
	 */
	public static HashSet<String> extractAssignments(ForEachStmt f) {
	    VoidVisitor<HashSet<String>> collectAssignments = new CollectAssignments();
	    HashSet<String> assignments = new HashSet<>();
	    collectAssignments.visit(f, assignments);
	    return assignments;
	}

	/**
	 * Extracts all variables that are assigned values within a traditional for-loop.
	 *
	 * @param f the ForStmt node representing the for-loop to analyze
	 * @return a HashSet containing the names of all assigned variables within the loop
	 */
	public static HashSet<String> extractAssignments(ForStmt f) {
	    VoidVisitor<HashSet<String>> collectAssignments = new CollectAssignments();
	    HashSet<String> assignments = new HashSet<>();
	    collectAssignments.visit(f, assignments);
	    return assignments;
	}

	/**
	 * Extracts all unary expressions (e.g., increments, decrements) applied to variables
	 * within a foreach-loop. Logical NOT operations are ignored.
	 *
	 * @param f the ForEachStmt node representing the foreach-loop to analyze
	 * @return a HashSet containing the names of all variables involved in unary expressions
	 */
	public static HashSet<String> extractUnaries(ForEachStmt f) {
	    VoidVisitor<HashSet<String>> collectUnaries = new CollectUnary();
	    HashSet<String> unaries = new HashSet<>();
	    collectUnaries.visit(f, unaries);
	    return unaries;
	}

	/**
	 * Extracts all unary expressions (e.g., increments, decrements) applied to variables
	 * within a traditional for-loop. Logical NOT operations are ignored.
	 *
	 * @param f the ForStmt node representing the for-loop to analyze
	 * @return a HashSet containing the names of all variables involved in unary expressions
	 */
	public static HashSet<String> extractUnaries(ForStmt f) {
	    VoidVisitor<HashSet<String>> collectUnaries = new CollectUnary();
	    HashSet<String> unaries = new HashSet<>();
	    collectUnaries.visit(f, unaries);
	    return unaries;
	}

}
