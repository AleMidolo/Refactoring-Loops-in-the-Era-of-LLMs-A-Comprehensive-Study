return _pastEntries.stream()
        .filter(entry -> entry.id == entryID)
        .findFirst()
        .orElse(null);