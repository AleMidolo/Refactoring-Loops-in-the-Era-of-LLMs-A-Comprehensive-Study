for (int c = 0; c < unchangedColumns.size(); c++) {
    Column unchangedColumn = unchangedColumns.get(c);
    int cellIndex = unchangedColumn.getCellIndex();
    reusableRow.setCell(cellIndex, oldRow.getCell(cellIndex));
}