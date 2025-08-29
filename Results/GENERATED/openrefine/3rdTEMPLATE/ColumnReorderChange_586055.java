project.columnModel.getColumnNames().stream()
    .map(project.columnModel::getColumnByName)
    .filter(oldColumn -> !_newColumns.contains(oldColumn))
    .forEach(_removedColumns::add);