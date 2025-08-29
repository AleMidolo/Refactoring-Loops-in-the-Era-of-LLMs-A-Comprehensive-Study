for (Entry<PropertyIdValue, List<StatementEdit>> entry : groupedEdits.entrySet()) {
    List<StatementEdit> statementEdits = entry.getValue().stream().map(statementEdit -> statementEdit.withSubjectId(currentDocument.getEntityId())).collect(Collectors.toList());
    StatementGroupEdit statementGroupEdit = new StatementGroupEdit(statementEdits);
    StatementGroup statementGroup = currentDocument.findStatementGroup(entry.getKey().getId());
    statementGroupEdit.contributeToStatementUpdate(builder, statementGroup);
}