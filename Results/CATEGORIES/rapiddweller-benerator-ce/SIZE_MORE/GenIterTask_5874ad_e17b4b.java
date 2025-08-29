for (Statement statement : statements) {
    statement = StatementUtil.getRealStatement(statement, scopeContext);
    if (statement instanceof ScopedLifeCycleHolder) {
        ScopedLifeCycleHolder holder = (ScopedLifeCycleHolder) statement;
        String scope = holder.getScope();
        if (scope == null || productName.equals(scope)) {
            scopes.add(holder);
        }
    } else if (statement instanceof GenIterStatement) {
        GenIterStatement subGenerate = (GenIterStatement) statement;
        checkScopes(subGenerate.getTask().statements, subGenerate.getChildContext());
    }
}