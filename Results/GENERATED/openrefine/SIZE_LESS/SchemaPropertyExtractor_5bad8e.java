snakExprs.stream()
    .map(WbSnakExpr::getProp)
    .filter(qualifierProperty -> qualifierProperty instanceof WbPropConstant)
    .map(qualifierProperty -> Datamodel.makeWikidataPropertyIdValue(((WbPropConstant) qualifierProperty).getPid()))
    .forEach(properties::add);