subStatements.stream()
    .filter(subStatement -> subStatement instanceof Closeable)
    .forEach(subStatement -> ((Closeable) subStatement).close());