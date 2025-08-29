for (WbStatementExpr expr : statementExprs) {
    try {
        statements.add(expr.evaluate(ctxt, subject, propertyId));
    } catch (SkipSchemaExpressionException e) {
        continue;
    }
}