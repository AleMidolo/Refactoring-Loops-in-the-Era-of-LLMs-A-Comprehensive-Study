for (Statement statement : update.getAddedStatements()) {
    Snak mainSnak = statement.getClaim().getMainSnak();
    PropertyIdValue pid = mainSnak.getPropertyId();
    Set<Value> values;
    if (mainSnak instanceof ValueSnak) {
        Value value = ((ValueSnak) mainSnak).getValue();
        if (propertyIdValueValueMap.containsKey(pid)) {
            values = propertyIdValueValueMap.get(pid);
        } else {
            values = new HashSet<>();
        }
        values.add(value);
        propertyIdValueValueMap.put(pid, values);
    }
}