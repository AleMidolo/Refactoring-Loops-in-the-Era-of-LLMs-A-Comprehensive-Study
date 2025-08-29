for (StatementEdit edit : statementEdits) {
    StatementMerger merger = edit.getMerger();
    Stream<Statement> matchingStatements = statements.stream().filter(statement -> {
        return merger.match(statement, edit.getStatement());
    });
    StatementEditingMode mode = edit.getMode();
    switch(mode) {
        case ADD:
            Optional<Statement> anyMatching = matchingStatements.findAny();
            if (anyMatching.isEmpty()) {
                builder.add(edit.getStatement());
            }
            break;
        case ADD_OR_MERGE:
            Optional<Statement> firstMatching = matchingStatements.findFirst();
            if (firstMatching.isEmpty()) {
                builder.add(edit.getStatement());
            } else {
                builder.replace(merger.merge(firstMatching.get(), edit.getStatement()));
            }
            break;
        case DELETE:
            matchingStatements.forEach(matchingStatement -> {
                builder.remove(matchingStatement.getStatementId());
            });
            break;
        default:
            throw new IllegalStateException("Unsupported statement editing mode " + mode);
    }
}