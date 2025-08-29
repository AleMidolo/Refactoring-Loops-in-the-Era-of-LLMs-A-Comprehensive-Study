List<PropertyIdValue> propertyIdValues = pids.stream()
        .map(Datamodel::makeWikidataPropertyIdValue)
        .collect(Collectors.toList());