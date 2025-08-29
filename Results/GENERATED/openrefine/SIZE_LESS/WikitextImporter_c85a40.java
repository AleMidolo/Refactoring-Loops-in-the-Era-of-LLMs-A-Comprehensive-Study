dataReader.columnReconciled.keySet().stream()
    .filter(index -> dataReader.columnReconciled.get(index))
    .forEach(index -> {
        Column col = project.columnModel.columns.get(index);
        col.setReconStats(ReconStats.create(project, index));
        col.setReconConfig(cfg);
    });