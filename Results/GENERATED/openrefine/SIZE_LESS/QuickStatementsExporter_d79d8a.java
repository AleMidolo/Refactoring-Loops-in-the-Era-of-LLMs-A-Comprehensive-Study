item.getStatementEdits().stream()
    .forEach(s -> translateStatement(qid, s.getStatement(), s.getPropertyId().getId(), s.getMode() == StatementEditingMode.ADD_OR_MERGE, writer));