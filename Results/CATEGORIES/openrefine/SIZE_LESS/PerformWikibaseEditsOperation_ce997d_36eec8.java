for (CellAtRow errorCell : cells) {
    int rowId = errorCell.row;
    Cell oldCell = _project.rows.get(rowId).getCell(resultsCellIndex);
    cellChanges[i] = new CellChange(rowId, resultsCellIndex, oldCell, errorCell.cell);
    i++;
}