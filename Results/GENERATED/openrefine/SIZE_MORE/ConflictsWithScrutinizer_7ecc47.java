update.getAddedStatements().stream()
    .forEach(statement -> {
        PropertyIdValue pid = statement.getClaim().getMainSnak().getPropertyId();
        Value value = null;
        Snak mainSnak = statement.getClaim().getMainSnak();
        if (mainSnak instanceof ValueSnak) {
            value = ((ValueSnak) mainSnak).getValue();
        }
        Set<Value> values;
        if (value != null) {
            if (propertyIdValueValueMap.containsKey(pid)) {
                values = propertyIdValueValueMap.get(pid);
            } else {
                values = new HashSet<>();
            }
            values.add(value);
            propertyIdValueValueMap.put(pid, values);
        }
    });