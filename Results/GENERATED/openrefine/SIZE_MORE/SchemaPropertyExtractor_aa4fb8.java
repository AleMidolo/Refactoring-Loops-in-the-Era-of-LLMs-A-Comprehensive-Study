entityDocumentExprs.stream()
    .map(entityDocExpr -> {
        List<WbStatementGroupExpr> statementGroups = Collections.emptyList();
        if (entityDocExpr instanceof WbItemEditExpr) {
            statementGroups = ((WbItemEditExpr) entityDocExpr).getStatementGroups();
        } else if (entityDocExpr instanceof WbMediaInfoEditExpr) {
            statementGroups = ((WbMediaInfoEditExpr) entityDocExpr).getStatementGroups();
        } else {
            throw new IllegalStateException("Unsupported entity type");
        }
        return statementGroups.stream();
    })
    .forEach(groupStream -> {
        groupStream.forEach(statementGroup -> {
            WbExpression<? extends PropertyIdValue> statementGroupProperty = statementGroup.getProperty();
            if (statementGroupProperty instanceof WbPropConstant) {
                properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) statementGroupProperty).getPid()));
            }
            statementGroup.getStatements().forEach(statementExpr -> {
                List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
                statementExpr.getReferences().forEach(referenceExpr -> {
                    snakExprs.addAll(referenceExpr.getSnaks());
                });
                snakExprs.forEach(snakExpr -> {
                    WbExpression<? extends PropertyIdValue> qualifierProperty = snakExpr.getProp();
                    if (qualifierProperty instanceof WbPropConstant) {
                        properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()));
                    }
                });
            });
        });
    });