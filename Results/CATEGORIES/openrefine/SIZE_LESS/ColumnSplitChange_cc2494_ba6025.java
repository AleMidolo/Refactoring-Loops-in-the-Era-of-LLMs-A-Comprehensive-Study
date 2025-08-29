for (int i = 0; i < _columnNames.size(); i++) {
    project.columnModel.columns.remove(_columnIndex + 1);
    ProjectManager.singleton.getLookupCacheManager().flushLookupsInvolvingProjectColumn(project.id, _columnNames.get(i));
}