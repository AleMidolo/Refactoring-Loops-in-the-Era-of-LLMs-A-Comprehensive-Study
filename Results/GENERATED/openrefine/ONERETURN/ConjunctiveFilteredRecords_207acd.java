_recordFilters.stream()
    .allMatch(recordFilter -> recordFilter.filterRecord(project, record));