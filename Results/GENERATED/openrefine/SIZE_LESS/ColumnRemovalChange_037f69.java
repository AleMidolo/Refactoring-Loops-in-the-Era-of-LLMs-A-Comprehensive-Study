_oldCells.stream()
    .forEach(cell -> project.rows.get(cell.row).cells.set(cellIndex, cell.cell));