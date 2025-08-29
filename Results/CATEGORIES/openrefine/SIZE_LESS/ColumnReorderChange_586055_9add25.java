for (String n : project.columnModel.getColumnNames()) {
    Column oldColumn = project.columnModel.getColumnByName(n);
    if (!_newColumns.contains(oldColumn)) {
        _removedColumns.add(oldColumn);
    }
}