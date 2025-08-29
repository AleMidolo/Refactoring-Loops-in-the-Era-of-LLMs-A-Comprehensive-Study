project.columnModel.columns.stream()
    .map(c -> new Column(c.getCellIndex() + 1, c.getName()))
    .forEach(newColumns::add);