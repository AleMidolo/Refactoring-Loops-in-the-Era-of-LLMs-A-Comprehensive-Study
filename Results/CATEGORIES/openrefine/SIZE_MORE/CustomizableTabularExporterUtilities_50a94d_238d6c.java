for (String columnName : columnNames) {
    Column column = project.columnModel.getColumnByName(columnName);
    CellFormatter formatter = columnNameToFormatter.get(columnName);
    CellData cellData = formatter.format(project, column, row.getCell(column.getCellIndex()));
    cells.add(cellData);
    if (cellData != null) {
        nonNullCount++;
    }
}