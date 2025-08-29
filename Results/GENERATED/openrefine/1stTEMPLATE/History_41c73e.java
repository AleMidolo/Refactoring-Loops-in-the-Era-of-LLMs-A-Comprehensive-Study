return _futureEntries.stream()
    .filter(entry -> entry.id == entryID)
    .findFirst()
    .orElse(null);