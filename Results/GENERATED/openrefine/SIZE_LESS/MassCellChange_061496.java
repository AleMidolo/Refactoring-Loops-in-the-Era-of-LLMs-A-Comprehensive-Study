_cellChanges.stream()
    .forEach(cellChange -> rows.get(cellChange.row).setCell(cellChange.cellIndex, cellChange.oldCell));