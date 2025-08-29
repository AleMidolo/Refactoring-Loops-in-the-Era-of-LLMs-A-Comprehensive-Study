update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .filter(mainSnak -> mainSnak instanceof ValueSnak)
    .map(mainSnak -> (ValueSnak) mainSnak)
    .forEach(mainValueSnak -> propertyIdValueValueMap.put(mainValueSnak.getPropertyId(), mainValueSnak.getValue());