for (CellChange cellChange : _cellChanges) {
    rows.get(cellChange.row).setCell(cellChange.cellIndex, cellChange.oldCell);
}