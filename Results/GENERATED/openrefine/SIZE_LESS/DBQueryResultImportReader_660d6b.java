dbColumns.stream()
    .map(DatabaseColumn::getName)
    .forEach(row::add);