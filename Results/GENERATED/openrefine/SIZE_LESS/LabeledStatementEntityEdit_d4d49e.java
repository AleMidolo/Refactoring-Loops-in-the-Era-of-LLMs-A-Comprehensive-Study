groupedEdits.entrySet().stream()
        .map(entry -> entry.getValue().stream()
                .map(statementEdit -> statementEdit.withSubjectId(currentDocument.getEntityId()))
                .collect(Collectors.toList()))
        .map(StatementGroupEdit::new)
        .forEach(statementGroupEdit -> {
            StatementGroup statementGroup = currentDocument.findStatementGroup(statementGroupEdit.getStatements().get(0).getSubject().getId());
            statementGroupEdit.contributeToStatementUpdate(builder, statementGroup);
        });