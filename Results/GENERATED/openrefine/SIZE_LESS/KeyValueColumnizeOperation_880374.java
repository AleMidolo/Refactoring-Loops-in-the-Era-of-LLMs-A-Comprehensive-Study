oldColumns.stream()
    .filter(column -> oldColumns.indexOf(column) != keyColumnIndex && oldColumns.indexOf(column) != valueColumnIndex && oldColumns.indexOf(column) != noteColumnIndex)
    .forEach(unchangedColumns::add);