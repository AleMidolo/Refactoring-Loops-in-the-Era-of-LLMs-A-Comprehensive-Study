for (int i = 0; i < _columnNames.size(); i++) {
    String name = _columnNames.get(i);
    int cellIndex = _firstNewCellIndex + i;
    Column column = new Column(cellIndex, name);
    ReconType columnType = _columnTypes.get(i);
    column.setReconConfig(new DataExtensionReconConfig(_service, _identifierSpace, _schemaSpace, columnType));
    if (project.columnModel.getColumnByName(_baseColumnName) != null) {
        column.setSourceReconConfig(project.columnModel.getColumnByName(_baseColumnName).getReconConfig());
    }
    ReconStats reconStats = ReconStats.create(project, cellIndex);
    if (reconStats.matchedTopics > 0) {
        column.setReconStats(reconStats);
    }
    try {
        project.columnModel.addColumn(_columnInsertIndex + i, column, true);
        _columnNames.set(i, column.getName());
    } catch (ModelException e) {
    }
}