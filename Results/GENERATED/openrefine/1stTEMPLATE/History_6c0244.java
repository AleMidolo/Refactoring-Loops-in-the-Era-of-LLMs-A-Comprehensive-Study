return _pastEntries.stream()
        .filter(pastEntry -> pastEntry.id == entryID)
        .findFirst()
        .orElse(null);