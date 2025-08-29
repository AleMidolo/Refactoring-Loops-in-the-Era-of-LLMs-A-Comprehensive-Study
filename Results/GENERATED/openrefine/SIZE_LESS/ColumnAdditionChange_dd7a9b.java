_newCells.stream()
    .map(cell -> _newCellIndex)
    .forEach(cell -> project.rows.get(cell.row).setCell(_newCellIndex, null));