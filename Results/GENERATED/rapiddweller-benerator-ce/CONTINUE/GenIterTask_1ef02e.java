statements.stream()
        .map(statement -> statements.get(i))
        .peek(statement -> success = statement.execute(context))
        .filter(statement -> !success && (statement instanceof ValidationStatement))
        .findFirst()
        .ifPresent(statement -> {
            i = -1;
            success = true;
        });

if (!success) {
    statements.stream()
            .map(statement -> statements.get(i))
            .filter(statement -> statement instanceof MessageHolder)
            .findFirst()
            .ifPresent(statement -> this.message = ((MessageHolder) statement).getMessage());
}