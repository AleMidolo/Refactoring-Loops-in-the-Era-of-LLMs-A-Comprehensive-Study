for (int cellIndex = 0; cellIndex <= lastCell; cellIndex++) {
    Cell cell = null;
    OdfTableCell sourceCell = row.getCellByIndex(cellIndex);
    if (sourceCell != null) {
        cell = extractCell(sourceCell);
    }
    cells.add(cell);
    if (cell != null && cellIndex > maxCol) {
        maxCol = cellIndex;
    }
}