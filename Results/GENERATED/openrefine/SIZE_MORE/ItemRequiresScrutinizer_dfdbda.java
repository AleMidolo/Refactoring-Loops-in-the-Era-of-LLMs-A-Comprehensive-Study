update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .filter(mainSnak -> mainSnak instanceof ValueSnak)
    .map(mainSnak -> (ValueSnak) mainSnak)
    .forEach(mainSnak -> {
        PropertyIdValue pid = mainSnak.getPropertyId();
        Value value = mainSnak.getValue();
        Set<Value> values = propertyIdValueValueMap.getOrDefault(pid, new HashSet<>());
        values.add(value);
        propertyIdValueValueMap.put(pid, values);
    });