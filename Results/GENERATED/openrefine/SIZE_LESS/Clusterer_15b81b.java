_colindex = project.columnModel.columns.stream()
        .filter(column -> column.getName().equals(colname))
        .findFirst()
        .map(Column::getCellIndex)
        .orElse(-1);