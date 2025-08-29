IntStream.range(0, _rowCount)
    .mapToObj(n -> {
        int newIndex = i;
        String columnName;
        do {
            columnName = _columnName + " " + newIndex++;
        } while (project.columnModel.getColumnByName(columnName) != null);
        return new Column(i + n, columnName);
    })
    .forEach(newColumns::add);