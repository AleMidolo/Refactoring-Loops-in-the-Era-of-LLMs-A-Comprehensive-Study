update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .filter(mainSnak -> mainSnak instanceof ValueSnak)
    .map(mainSnak -> (ValueSnak) mainSnak)
    .forEach(mainSnak -> propertyIdValueValueMap.put(mainSnak.getPropertyId(), mainSnak.getValue());