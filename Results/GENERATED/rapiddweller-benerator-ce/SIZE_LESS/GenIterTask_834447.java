statements.stream()
    .map(statement -> StatementUtil.getRealStatement(statement, context))
    .filter(statement -> statement instanceof Closeable)
    .map(statement -> (Closeable) statement)
    .forEach(IOUtil::close);