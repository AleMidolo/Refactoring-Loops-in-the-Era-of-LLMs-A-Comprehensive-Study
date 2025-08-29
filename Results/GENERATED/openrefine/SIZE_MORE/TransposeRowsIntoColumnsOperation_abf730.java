IntStream.range(0, columnCount)
    .mapToObj(i -> oldColumns.get(i))
    .forEach(column -> {
        if (column.getIndex() == columnIndex) {
            AtomicInteger newIndex = new AtomicInteger(1);
            IntStream.range(0, _rowCount)
                .mapToObj(n -> {
                    String columnName = _columnName + " " + newIndex.getAndIncrement();
                    while (project.columnModel.getColumnByName(columnName) != null) {
                        columnName = _columnName + " " + newIndex.getAndIncrement();
                    }
                    return new Column(column.getIndex() + n, columnName);
                })
                .forEach(newColumns::add);
        } else if (column.getIndex() < columnIndex) {
            newColumns.add(new Column(column.getIndex(), column.getName()));
        } else {
            newColumns.add(new Column(column.getIndex() + _rowCount - 1, column.getName()));
        }
    });