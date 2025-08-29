_rowFilters.stream()
    .noneMatch(rowFilter -> !rowFilter.filterRow(project, rowIndex, row));