statements.stream()
    .map(statement -> statement.execute(context) ? null : (statement instanceof ValidationStatement) ? -1 : statement)
    .filter(statement -> statement != null)
    .findFirst()
    .ifPresent(statement -> {
        if (statement instanceof MessageHolder) {
            this.message = ((MessageHolder) statement).getMessage();
        }
    });