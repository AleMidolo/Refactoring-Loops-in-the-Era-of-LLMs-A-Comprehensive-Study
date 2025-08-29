pids.stream()
    .map(Datamodel::makeWikidataPropertyIdValue)
    .forEach(propertyIdValues::add);