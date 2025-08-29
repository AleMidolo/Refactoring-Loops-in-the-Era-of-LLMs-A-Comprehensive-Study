_columnNames.stream()
        .forEach(name -> {
            project.columnModel.columns.remove(_columnIndex + 1);
            ProjectManager.singleton.getLookupCacheManager().flushLookupsInvolvingProjectColumn(project.id, name);
        });