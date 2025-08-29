for (WbExpression<? extends EntityEdit> expr : entityEditExprs) {
    try {
        result.add(expr.evaluate(ctxt));
    } catch (SkipSchemaExpressionException e) {
        continue;
    }
}