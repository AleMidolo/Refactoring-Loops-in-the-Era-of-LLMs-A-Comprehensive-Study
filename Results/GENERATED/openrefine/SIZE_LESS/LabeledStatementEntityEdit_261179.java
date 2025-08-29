groupedEdits.entrySet().stream()
    .map(entry -> {
        List<StatementEdit> statementEdits = entry.getValue().stream()
                .map(statementEdit -> statementEdit.withSubjectId(currentDocument.getEntityId()))
                .collect(Collectors.toList());
        return new AbstractMap.SimpleEntry<>(new StatementGroupEdit(statementEdits), currentDocument.findStatementGroup(entry.getKey().getId()));
    })
    .forEach(entry -> entry.getKey().contributeToStatementUpdate(builder, entry.getValue()));