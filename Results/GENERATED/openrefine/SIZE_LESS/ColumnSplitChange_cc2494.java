_columnNames.stream()
        .forEach(columnName -> {
            project.columnModel.columns.remove(_columnIndex + 1);
            ProjectManager.singleton.getLookupCacheManager().flushLookupsInvolvingProjectColumn(project.id, columnName);
        });