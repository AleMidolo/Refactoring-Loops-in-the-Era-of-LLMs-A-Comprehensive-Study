for (Statement statement : update.getAddedStatements()) {
    Snak mainSnak = statement.getClaim().getMainSnak();
    if (mainSnak instanceof ValueSnak) {
        PropertyIdValue pid = mainSnak.getPropertyId();
        Value value = ((ValueSnak) mainSnak).getValue();
        propertyIdValueValueMap.put(pid, value);
    }
}