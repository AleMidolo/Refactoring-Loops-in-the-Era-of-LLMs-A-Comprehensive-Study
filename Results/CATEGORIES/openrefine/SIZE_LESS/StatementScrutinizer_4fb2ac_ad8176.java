for (StatementEdit statementEdit : update.getStatementEdits()) {
    scrutinize(statementEdit.getStatement(), currentEntityId, !StatementEditingMode.DELETE.equals(statementEdit.getMode()));
}