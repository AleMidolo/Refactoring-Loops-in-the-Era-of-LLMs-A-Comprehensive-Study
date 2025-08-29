impactedColumns.stream()
    .map(colId -> project.columnModel.getColumnByCellIndex(colId))
    .forEach(column -> column.setReconStats(ReconStats.create(project, column.getCellIndex())));