rowDependency.cellDependencies.stream()
    .filter(Objects::nonNull)
    .forEach(cd -> rowDependency.contextRows.add(cd.rowIndex));