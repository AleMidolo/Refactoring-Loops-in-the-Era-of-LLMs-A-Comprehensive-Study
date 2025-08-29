for (Statement statement : statements) {
    statement = StatementUtil.getRealStatement(statement, context);
    if (statement instanceof LifeCycleHolder) {
        ((LifeCycleHolder) statement).init(context);
    }
}