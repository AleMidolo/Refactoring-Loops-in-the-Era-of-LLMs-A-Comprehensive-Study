_futureEntries.stream()
    .skip(1)
    .filter(entry -> entry.id == lastDoneEntryID)
    .findFirst()
    .ifPresent(entry -> redo(_futureEntries.indexOf(entry) + 1));