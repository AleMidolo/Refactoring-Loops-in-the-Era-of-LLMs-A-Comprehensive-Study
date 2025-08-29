for (Statement statement : statements) {
    statement = StatementUtil.getRealStatement(statement, context);
    if (statement instanceof ScopedLifeCycleHolder) {
        ScopedLifeCycleHolder holder = (ScopedLifeCycleHolder) statement;
        holder.resetIfNeeded();
    } else if (statement instanceof Resettable) {
        ((Resettable) statement).reset();
    }
}