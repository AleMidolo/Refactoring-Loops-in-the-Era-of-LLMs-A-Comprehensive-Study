for (WbSnakExpr snakExpr : snakExprs) {
    WbExpression<? extends PropertyIdValue> qualifierProperty = snakExpr.getProp();
    if (qualifierProperty instanceof WbPropConstant) {
        properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()));
    }
}