for (Integer colId : impactedColumns) {
    Column column = project.columnModel.getColumnByCellIndex(colId);
    column.setReconStats(ReconStats.create(project, colId));
}