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

public class Visitors {

	public static class CollectForStmt extends VoidVisitorAdapter<HashSet<ForStmt>>{
		@Override
		public void visit(ForStmt ne, HashSet<ForStmt> allNames) {
			super.visit(ne, allNames);
			allNames.add(ne);
		}
	}
	
	public static class CollectForEachStmt extends VoidVisitorAdapter<HashSet<ForEachStmt>>{
		@Override
		public void visit(ForEachStmt md, HashSet<ForEachStmt> methods) {
			super.visit(md, methods);
			methods.add(md);
		}
	}
	
	public static class CollectNames extends VoidVisitorAdapter<HashSet<NameExpr>>{
		@Override
		public void visit(NameExpr ne, HashSet<NameExpr> names) {
			super.visit(ne, names);
			names.add(ne);
		}
	}
	
	public static class CollectSimpleNames extends VoidVisitorAdapter<HashSet<SimpleName>>{
		@Override
		public void visit(SimpleName ne, HashSet<SimpleName> names) {
			super.visit(ne, names);
			names.add(ne);
		}
	}
	
	public static class CollectVariable extends VoidVisitorAdapter<HashSet<String>>{
		@Override
		public void visit(VariableDeclarator vd, HashSet<String> variables) {
			super.visit(vd, variables);
			variables.add(vd.getNameAsString());
		}
	}
	
	public static class CollectUnary extends VoidVisitorAdapter<HashSet<String>>{
		@Override
		public void visit(UnaryExpr ue, HashSet<String> exprs) {
			super.visit(ue, exprs);
			if(ue.getOperator() == UnaryExpr.Operator.LOGICAL_COMPLEMENT)
				return;
			else if(ue.getExpression().isFieldAccessExpr())
				handleFieldAccessExpr(ue.getExpression().asFieldAccessExpr(), exprs);
			else if(ue.getExpression().isArrayAccessExpr())
				handleArrayAccessExpr(ue.getExpression().asArrayAccessExpr(), exprs);
			else {
				if(!ue.getExpression().isNameExpr())
					return;
				exprs.add(ue.getExpression().toString());
			}
			exprs.add(ue.getExpression().toString());
		}
	}
	
	public static class CollectAssignments extends VoidVisitorAdapter<HashSet<String>>{
		@Override
		public void visit(AssignExpr ae, HashSet<String> assignments) {
			super.visit(ae, assignments);
			if(ae.getTarget().isFieldAccessExpr())
				handleFieldAccessExpr(ae.getTarget(), assignments);
			else if(ae.getTarget().isArrayAccessExpr()) 
				handleArrayAccessExpr(ae.getTarget().asArrayAccessExpr(), assignments);
			else {
				if(!ae.getTarget().isNameExpr())
					return;
				assignments.add(ae.getTarget().toString());
			}
		}
	}
	
	private static void handleArrayAccessExpr(ArrayAccessExpr aae, HashSet<String> assignments) {
		if(aae.getName().isNameExpr())
			assignments.add(aae.getName().toString());
		else if(aae.getName().isFieldAccessExpr())
			handleFieldAccessExpr(aae.getName(), assignments);
		else if(aae.getName().isArrayAccessExpr())
			handleArrayAccessExpr(aae.getName().asArrayAccessExpr(), assignments);
	}
	
	private static void handleFieldAccessExpr(Expression e, HashSet<String> assignments) {
		Expression expr = e;
		while(!expr.isNameExpr()) {
			if(expr.isFieldAccessExpr())
				expr = expr.asFieldAccessExpr().getScope();
			else if(expr.isMethodCallExpr()) {
				if(expr.asMethodCallExpr().getScope().isPresent())
					expr = expr.asMethodCallExpr().getScope().get();
				else return;
			}
			else if(expr.isArrayAccessExpr()) {
				if(expr.asArrayAccessExpr().getName().isNameExpr()) {
					assignments.add(expr.asArrayAccessExpr().getName().toString());
					return;
				}
				else
					expr = expr.asArrayAccessExpr().getName();
			}
			else
				return;
		}
		if(expr.isNameExpr())
			assignments.add(expr.asNameExpr().getNameAsString());
	}
	
	public static HashSet<ForStmt> extractForStmt(CompilationUnit cu){
		VoidVisitor<HashSet<ForStmt>> collectFor = new CollectForStmt();
		HashSet<ForStmt> forStmts = new HashSet<>();
		collectFor.visit(cu, forStmts);
		return forStmts;
	}
	
	public static HashSet<ForEachStmt> extractForEachStmt(CompilationUnit cu){
		VoidVisitor<HashSet<ForEachStmt>> collectForEach = new CollectForEachStmt();
		HashSet<ForEachStmt> forEachstmts = new HashSet<>();
		collectForEach.visit(cu, forEachstmts);
		return forEachstmts;
	}
	
	public static HashSet<NameExpr> extractNames(BlockStmt bs){
		VoidVisitor<HashSet<NameExpr>> collectNames = new CollectNames();
		HashSet<NameExpr> names = new HashSet<>();
		collectNames.visit(bs, names);
		return names;
	}
	
	public static HashSet<SimpleName> extractSimpleNames(BlockStmt bs){
		VoidVisitor<HashSet<SimpleName>> collectNames = new CollectSimpleNames();
		HashSet<SimpleName> names = new HashSet<>();
		collectNames.visit(bs, names);
		return names;
	}
	 
	public static HashSet<String> extractVariables(ForEachStmt f) {
		VoidVisitor<HashSet<String>> collectVariables = new CollectVariable();
		HashSet<String> variables = new HashSet<>();
		collectVariables.visit(f, variables);
		return variables;
	}
	
	public static HashSet<String> extractVariables(ForStmt f) {
		VoidVisitor<HashSet<String>> collectVariables = new CollectVariable();
		HashSet<String> variables = new HashSet<>();
		collectVariables.visit(f, variables);
		return variables;
	}
	
	public static HashSet<String> extractAssignments(ForEachStmt f) {
		VoidVisitor<HashSet<String>> collectAssignments = new CollectAssignments();
		HashSet<String> assignments = new HashSet<>();
		collectAssignments.visit(f, assignments);
		return assignments;
	}
	
	public static HashSet<String> extractAssignments(ForStmt f) {
		VoidVisitor<HashSet<String>> collectAssignments = new CollectAssignments();
		HashSet<String> assignments = new HashSet<>();
		collectAssignments.visit(f, assignments);
		return assignments;
	}
	
	public static HashSet<String> extractUnaries(ForEachStmt f) {
		VoidVisitor<HashSet<String>> collectUnaries = new CollectUnary();
		HashSet<String> unaries = new HashSet<>();
		collectUnaries.visit(f, unaries);
		return unaries;
	}
	
	public static HashSet<String> extractUnaries(ForStmt f) {
		VoidVisitor<HashSet<String>> collectUnaries = new CollectUnary();
		HashSet<String> unaries = new HashSet<>();
		collectUnaries.visit(f, unaries);
		return unaries;
	}
}
