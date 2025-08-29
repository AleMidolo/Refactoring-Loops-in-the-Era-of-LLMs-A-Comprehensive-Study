_lookups.entrySet().stream()
    .filter(entry -> entry.getValue().targetProjectID == projectID)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList())
    .forEach(_lookups::remove);