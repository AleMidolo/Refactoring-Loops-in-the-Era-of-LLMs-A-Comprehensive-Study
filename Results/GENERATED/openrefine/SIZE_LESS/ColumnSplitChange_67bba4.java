_columnNames.stream()
    .map(name -> {
        int cellIndex = _firstNewCellIndex + _columnNames.indexOf(name);
        return new Column(cellIndex, name);
    })
    .forEach(column -> project.columnModel.columns.add(_columnIndex + 1 + project.columnModel.columns.indexOf(column), column));