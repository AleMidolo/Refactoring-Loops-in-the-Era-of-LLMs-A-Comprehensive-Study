statements.stream()
    .map(statement -> StatementUtil.getRealStatement(statement, context))
    .forEach(statement -> {
        if (statement instanceof ScopedLifeCycleHolder) {
            ((ScopedLifeCycleHolder) statement).resetIfNeeded();
        } else if (statement instanceof Resettable) {
            ((Resettable) statement).reset();
        }
    });