_lookups.entrySet().stream()
    .filter(entry -> entry.getValue().targetProjectID == projectID && entry.getValue().targetColumnName.equals(columnName))
    .map(Map.Entry::getKey)
    .forEach(_lookups::remove);