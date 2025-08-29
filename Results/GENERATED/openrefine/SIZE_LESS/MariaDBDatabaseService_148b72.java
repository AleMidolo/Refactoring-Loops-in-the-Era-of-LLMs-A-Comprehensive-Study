IntStream.rangeClosed(1, columnCount)
    .mapToObj(i -> new DatabaseColumn(metadata.getColumnName(i), metadata.getColumnLabel(i), DatabaseUtils.getDbColumnType(metadata.getColumnType(i)), metadata.getColumnDisplaySize(i)))
    .forEach(columns::add);