for (Column column : toColumns) {
    int cellIndex = column.getCellIndex();
    Cell cell = row.getCell(cellIndex);
    if (cell != null && cell.value != null) {
        Recon reconToCopy = cellValueToRecon.get(cell.value);
        boolean judged = cell.recon != null && cell.recon.judgment != Judgment.None;
        if (reconToCopy != null && (!judged || _applyToJudgedCells)) {
            Cell newCell = new Cell(cell.value, reconToCopy);
            CellChange cellChange = new CellChange(rowIndex, cellIndex, cell, newCell);
            cellChanges.add(cellChange);
        }
    }
}