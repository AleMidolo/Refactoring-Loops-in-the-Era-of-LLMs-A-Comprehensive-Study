_columnNames.stream()
    .map(name -> {
        int cellIndex = _firstNewCellIndex + _columnNames.indexOf(name);
        Column column = new Column(cellIndex, name);
        ReconType columnType = _columnTypes.get(_columnNames.indexOf(name));
        column.setReconConfig(new DataExtensionReconConfig(_service, _identifierSpace, _schemaSpace, columnType));
        if (project.columnModel.getColumnByName(_baseColumnName) != null) {
            column.setSourceReconConfig(project.columnModel.getColumnByName(_baseColumnName).getReconConfig());
        }
        ReconStats reconStats = ReconStats.create(project, cellIndex);
        if (reconStats.matchedTopics > 0) {
            column.setReconStats(reconStats);
        }
        return column;
    })
    .forEach(column -> {
        try {
            project.columnModel.addColumn(_columnInsertIndex + _columnNames.indexOf(column.getName()), column, true);
            _columnNames.set(_columnNames.indexOf(column.getName()), column.getName());
        } catch (ModelException e) {
        }
    });