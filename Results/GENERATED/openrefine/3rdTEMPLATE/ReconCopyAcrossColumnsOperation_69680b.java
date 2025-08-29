_toColumnNames.stream()
    .map(project.columnModel::getColumnByName)
    .filter(Objects::nonNull)
    .forEach(toColumns::add);