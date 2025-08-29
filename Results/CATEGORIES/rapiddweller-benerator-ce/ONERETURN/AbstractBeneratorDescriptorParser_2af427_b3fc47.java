for (Statement statement : parentPath) {
    if (isLoop(statement)) {
        return true;
    }
}