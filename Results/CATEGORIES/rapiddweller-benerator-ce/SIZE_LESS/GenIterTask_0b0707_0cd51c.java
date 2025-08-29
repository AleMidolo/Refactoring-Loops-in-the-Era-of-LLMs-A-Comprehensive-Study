for (int i = statements.size() - 1; i >= 0; i--) {
    Statement statement = statements.get(i);
    if (statement instanceof GenIterStatement) {
        lastSubGenIndex = i;
        break;
    }
}