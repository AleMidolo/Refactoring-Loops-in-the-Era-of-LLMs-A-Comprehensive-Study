update.getStatementEdits().stream()
    .forEach(statementEdit -> scrutinize(statementEdit.getStatement(), currentEntityId, !StatementEditingMode.DELETE.equals(statementEdit.getMode()));