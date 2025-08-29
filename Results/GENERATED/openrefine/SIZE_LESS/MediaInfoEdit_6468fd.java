other.getStatementEdits().stream()
    .filter(statement -> !newStatements.contains(statement))
    .forEach(newStatements::add);