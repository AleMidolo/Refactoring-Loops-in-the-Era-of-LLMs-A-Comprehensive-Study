propertySnakMap.values().stream()
    .map(snakList -> Datamodel.makeSnakGroup(snakList))
    .forEach(snakGroupList::add);