statementExprs.stream()
    .flatMap(statementExpr -> {
        List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
        return statementExpr.getReferences().stream().map(WbReferenceExpr::getSnaks)
                                                .peek(snakExprs::addAll)
                                                .flatMap(List::stream);
    })
    .map(WbSnakExpr::getProp)
    .filter(qualifierProperty -> qualifierProperty instanceof WbPropConstant)
    .map(qualifierProperty -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()))
    .forEach(properties::add);