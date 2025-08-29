fullBatch.stream()
    .forEach(doc -> {
        StatementUpdate statementUpdate = Datamodel.makeStatementUpdate(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        verify(editor, times(1)).editEntityDocument(
            Datamodel.makeMediaInfoUpdate((MediaInfoIdValue) doc.getEntityId(), doc.getRevisionId(), labelsUpdate, statementUpdate), false, summary, tags);
    });