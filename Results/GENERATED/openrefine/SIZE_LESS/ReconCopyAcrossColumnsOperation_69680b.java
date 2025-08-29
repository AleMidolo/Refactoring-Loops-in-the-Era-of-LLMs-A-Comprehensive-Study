_toColumnNames.stream()
    .map(c -> project.columnModel.getColumnByName(c))
    .filter(Objects::nonNull)
    .forEach(toColumns::add);