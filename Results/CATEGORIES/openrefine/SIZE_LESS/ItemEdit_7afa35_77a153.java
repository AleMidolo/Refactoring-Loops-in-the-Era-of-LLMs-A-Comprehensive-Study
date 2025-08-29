for (StatementEdit statement : other.getStatementEdits()) {
    if (!newStatements.contains(statement)) {
        newStatements.add(statement);
    }
}