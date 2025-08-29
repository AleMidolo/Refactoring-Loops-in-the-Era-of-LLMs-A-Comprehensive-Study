entityDocumentExprs.stream()
    .map(entityDocumentExpr -> {
        if (entityDocumentExpr instanceof WbItemEditExpr) {
            return ((WbItemEditExpr) entityDocumentExpr).getStatementGroups();
        } else if (entityDocumentExpr instanceof WbMediaInfoEditExpr) {
            return ((WbMediaInfoEditExpr) entityDocumentExpr).getStatementGroups();
        } else {
            throw new IllegalStateException("Unsupported entity type");
        }
    })
    .flatMap(List::stream)
    .forEach(statementGroup -> {
        WbExpression<? extends PropertyIdValue> statementGroupProperty = statementGroup.getProperty();
        if (statementGroupProperty instanceof WbPropConstant) {
            properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) statementGroupProperty).getPid()));
        }
        statementGroup.getStatements().stream()
            .flatMap(statementExpr -> {
                List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
                statementExpr.getReferences().stream()
                    .map(WbReferenceExpr::getSnaks)
                    .forEach(snakExprs::addAll);
                return snakExprs.stream();
            })
            .forEach(snakExpr -> {
                WbExpression<? extends PropertyIdValue> qualifierProperty = snakExpr.getProp();
                if (qualifierProperty instanceof WbPropConstant) {
                    properties.add(Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()));
                }
            });
    });