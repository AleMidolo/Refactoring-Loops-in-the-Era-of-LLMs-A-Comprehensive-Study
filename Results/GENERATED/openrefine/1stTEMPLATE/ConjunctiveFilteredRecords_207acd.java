_returnFilters.stream()
    .allMatch(recordFilter -> recordFilter.filterRecord(project, record));