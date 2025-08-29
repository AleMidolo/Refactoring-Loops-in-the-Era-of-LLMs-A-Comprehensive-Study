entityDocumentExprs.stream()
    .map(entityDocumentExpr -> {
        List<WbStatementGroupExpr> statementGroups = Collections.emptyList();
        if (entityDocumentExpr instanceof WbItemEditExpr) {
            statementGroups = ((WbItemEditExpr) entityDocumentExpr).getStatementGroups();
        } else if (entityDocumentExpr instanceof WbMediaInfoEditExpr) {
            statementGroups = ((WbMediaInfoEditExpr) entityDocumentExpr).getStatementGroups();
        } else {
            throw new IllegalStateException("Unsupported entity type");
        }
        return statementGroups;
    })
    .flatMap(List::stream)
    .forEach(statementGroup -> {
        WbExpression<? extends PropertyIdValue> statementGroupProperty = statementGroup.getProperty();
        if (statementGroupProperty instanceof WbPropConstant) {
            properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) statementGroupProperty).getPid()));
        }
        statementGroup.getStatements().forEach(statementExpr -> {
            List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
            statementExpr.getReferences().forEach(referenceExpr -> snakExprs.addAll(referenceExpr.getSnaks()));
            snakExprs.forEach(snakExpr -> {
                WbExpression<? extends PropertyIdValue> qualifierProperty = snakExpr.getProp();
                if (qualifierProperty instanceof WbPropConstant) {
                    properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()));
                }
            });
        });
    });