project.rows.stream()
    .forEach(row -> _removedColumns.stream()
        .map(RemovedColumn::getCellIndex)
        .forEach(cellIndex -> row.setCell(cellIndex, null)));