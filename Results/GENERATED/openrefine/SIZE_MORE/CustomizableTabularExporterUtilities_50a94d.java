columnNames.stream()
    .map(columnName -> project.columnModel.getColumnByName(columnName))
    .map(column -> columnNameToFormatter.get(columnName))
    .map(formatter -> formatter.format(project, column, row.getCell(column.getCellIndex())))
    .forEach(cellData -> {
        cells.add(cellData);
        if (cellData != null) {
            nonNullCount++;
        }
    });