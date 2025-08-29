statementGroups.stream()
    .map(WbStatementGroupExpr::getProperty)
    .filter(statementGroupProperty -> statementGroupProperty instanceof WbPropConstant)
    .map(property -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) property).getPid()))
    .forEach(properties::add);

statementGroups.stream()
    .flatMap(statementGroup -> statementGroup.getStatements().stream())
    .flatMap(statementExpr -> {
        List<WbSnakExpr> snakExprs = new ArrayList<>(statementExpr.getQualifiers());
        statementExpr.getReferences().forEach(referenceExpr -> snakExprs.addAll(referenceExpr.getSnaks()));
        return snakExprs.stream();
    })
    .map(WbSnakExpr::getProp)
    .filter(qualifierProperty -> qualifierProperty instanceof WbPropConstant)
    .map(property -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) property).getPid()))
    .forEach(properties::add);