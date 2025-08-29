_removedColumns.stream()
    .map(RemovedColumn::getCellIndex)
    .forEach(cellIndex -> project.rows.get(i).setCell(cellIndex, null));