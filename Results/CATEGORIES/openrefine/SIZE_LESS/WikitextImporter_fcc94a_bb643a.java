for (int i = 0; i != dataReader.columnReconciled.size(); i++) {
    if (dataReader.columnReconciled.get(i)) {
        Column col = project.columnModel.columns.get(i);
        col.setReconStats(ReconStats.create(project, i));
        col.setReconConfig(cfg);
    }
}