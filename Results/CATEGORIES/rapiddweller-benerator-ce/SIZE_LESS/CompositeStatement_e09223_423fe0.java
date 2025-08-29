for (Statement subStatement : subStatements) {
    if (subStatement instanceof Closeable) {
        ((Closeable) subStatement).close();
    }
}