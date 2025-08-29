columnNames.stream()
    .map(columnName -> {
        int index = project.columnModel.allocateNewCellIndex();
        return new Column(index, columnName);
    })
    .forEach(column -> project.columnModel.addColumn(column.getIndex(), column, true));