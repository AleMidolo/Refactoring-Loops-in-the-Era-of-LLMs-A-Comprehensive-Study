_pastEntries.stream()
    .filter(entry -> entry.id == lastDoneEntryID)
    .findFirst()
    .ifPresent(entry -> undo(_pastEntries.size() - _pastEntries.indexOf(entry) - 1));