statements.stream()
        .map(statement -> StatementUtil.getRealStatement(statement, scopeContext))
        .filter(statement -> statement instanceof ScopedLifeCycleHolder)
        .map(statement -> (ScopedLifeCycleHolder) statement)
        .filter(holder -> {
            String scope = holder.getScope();
            return scope == null || productName.equals(scope);
        })
        .forEach(scopes::add);

statements.stream()
        .filter(statement -> statement instanceof GenIterStatement)
        .map(statement -> (GenIterStatement) statement)
        .forEach(subGenerate -> checkScopes(subGenerate.getTask().statements, subGenerate.getChildContext()));