update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .filter(mainSnak -> mainSnak instanceof ValueSnak)
    .map(mainSnak -> (ValueSnak) mainSnak)
    .forEach(valueSnak -> {
        PropertyIdValue pid = valueSnak.getPropertyId();
        Value value = valueSnak.getValue();
        Set<Value> values = propertyIdValueValueMap.computeIfAbsent(pid, k -> new HashSet<>());
        values.add(value);
        propertyIdValueValueMap.put(pid, values);
    });