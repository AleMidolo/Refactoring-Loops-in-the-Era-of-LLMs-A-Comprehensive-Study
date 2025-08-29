for (WbSnakExpr expr : getSnaks()) {
    try {
        snakList.add(expr.evaluate(ctxt));
    } catch (SkipSchemaExpressionException e) {
        continue;
    }
}