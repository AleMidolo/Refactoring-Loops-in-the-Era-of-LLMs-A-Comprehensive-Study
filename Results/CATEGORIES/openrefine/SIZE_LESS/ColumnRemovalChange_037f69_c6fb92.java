for (CellAtRow cell : _oldCells) {
    project.rows.get(cell.row).cells.set(cellIndex, cell.cell);
}