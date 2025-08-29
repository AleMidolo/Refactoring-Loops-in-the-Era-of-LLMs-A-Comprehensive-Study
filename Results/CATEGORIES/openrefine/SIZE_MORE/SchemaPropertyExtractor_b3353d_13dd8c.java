for (WbStatementExpr statementExpr : statementExprs) {
    List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
    List<WbReferenceExpr> referenceExprs = statementExpr.getReferences();
    for (WbReferenceExpr referenceExpr : referenceExprs) {
        snakExprs.addAll(referenceExpr.getSnaks());
    }
    for (WbSnakExpr snakExpr : snakExprs) {
        WbExpression<? extends PropertyIdValue> qualifierProperty = snakExpr.getProp();
        if (qualifierProperty instanceof WbPropConstant) {
            properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()));
        }
    }
}