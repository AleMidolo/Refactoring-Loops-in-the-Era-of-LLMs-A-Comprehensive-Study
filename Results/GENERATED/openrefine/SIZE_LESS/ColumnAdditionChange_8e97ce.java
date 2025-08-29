_newCells.stream()
    .map(cell -> project.rows.get(cell.row))
    .forEach(row -> row.setCell(_newCellIndex, null));