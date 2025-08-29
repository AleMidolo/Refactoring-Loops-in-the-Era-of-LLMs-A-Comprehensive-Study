statementGroups.stream()
    .map(WbStatementGroupExpr::getProperty)
    .filter(statementGroupProperty -> statementGroupProperty instanceof WbPropConstant)
    .map(statementGroupProperty -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) statementGroupProperty).getPid()))
    .forEach(properties::add);

statementGroups.stream()
    .flatMap(statementGroup -> statementGroup.getStatements().stream())
    .map(WbStatementExpr::getQualifiers)
    .flatMap(Collection::stream)
    .map(WbSnakExpr::getProp)
    .filter(qualifierProperty -> qualifierProperty instanceof WbPropConstant)
    .map(qualifierProperty -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()))
    .forEach(properties::add);