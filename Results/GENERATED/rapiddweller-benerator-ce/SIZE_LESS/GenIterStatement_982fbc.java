parentPath.stream()
    .map(Statement::toString)
    .forEach(path::add);