columnNames.stream()
    .map(columnName -> project.columnModel.getColumnByName(columnName))
    .forEach(column -> {
        CellFormatter formatter = columnNameToFormatter.get(column.getName());
        CellData cellData = formatter.format(project, column, row.getCell(column.getCellIndex()));
        cells.add(cellData);
        if (cellData != null) {
            nonNullCount++;
        }
    });