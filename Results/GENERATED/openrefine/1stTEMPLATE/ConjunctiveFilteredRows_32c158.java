_rowFilters.stream()
    .anyMatch(rowFilter -> !rowFilter.filterRow(project, rowIndex, row));