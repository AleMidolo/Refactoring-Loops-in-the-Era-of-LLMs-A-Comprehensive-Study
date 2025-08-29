dataReader.columnReconciled.entrySet().stream()
        .filter(entry -> entry.getValue())
        .forEach(entry -> {
            int i = entry.getKey();
            Column col = project.columnModel.columns.get(i);
            col.setReconStats(ReconStats.create(project, i));
            col.setReconConfig(cfg);
        });