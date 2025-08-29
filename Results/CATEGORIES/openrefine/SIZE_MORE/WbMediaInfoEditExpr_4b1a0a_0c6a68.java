for (WbStatementGroupExpr expr : getStatementGroups()) {
    try {
        StatementGroupEdit statementGroupUpdate = expr.evaluate(ctxt, subjectId);
        for (StatementEdit s : statementGroupUpdate.getStatementEdits()) {
            update.addStatement(s);
        }
    } catch (SkipSchemaExpressionException e) {
        continue;
    }
}