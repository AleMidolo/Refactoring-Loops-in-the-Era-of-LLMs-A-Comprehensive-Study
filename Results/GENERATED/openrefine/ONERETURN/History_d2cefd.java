return _pastEntries.stream()
        .filter(entry -> entry.id == entryID)
        .findAny()
        .orElse(null);