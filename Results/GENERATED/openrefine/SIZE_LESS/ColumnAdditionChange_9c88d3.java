_newCells.stream()
        .forEach(cell -> project.rows.get(cell.row).setCell(_newCellIndex, cell.cell));