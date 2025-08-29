for (Statement statement : statements) {
    statement = StatementUtil.getRealStatement(statement, context);
    if (statement instanceof Closeable) {
        IOUtil.close((Closeable) statement);
    }
}