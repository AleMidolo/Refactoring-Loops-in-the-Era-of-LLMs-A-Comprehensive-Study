for (Statement statement : parentPath) {
    if (statement instanceof GenIterStatement) {
        return true;
    }
}