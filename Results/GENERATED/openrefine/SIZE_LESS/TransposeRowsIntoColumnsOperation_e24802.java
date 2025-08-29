IntStream.range(0, _rowCount)
    .mapToObj(n -> {
        String columnName = _columnName + " " + newIndex.incrementAndGet();
        while (project.columnModel.getColumnByName(columnName) != null) {
            columnName = _columnName + " " + newIndex.incrementAndGet();
        }
        return new Column(i + n, columnName);
    })
    .forEach(newColumns::add);