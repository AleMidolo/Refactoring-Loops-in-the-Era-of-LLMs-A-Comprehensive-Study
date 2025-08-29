_columnNames.stream()
    .map(project.columnModel::getColumnByName)
    .filter(Objects::nonNull)
    .forEach(_newColumns::add);