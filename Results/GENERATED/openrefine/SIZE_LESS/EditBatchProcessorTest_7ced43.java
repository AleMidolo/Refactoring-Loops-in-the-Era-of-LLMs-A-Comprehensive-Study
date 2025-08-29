fullBatch.stream()
        .map(doc -> Datamodel.makeStatementUpdate(Collections.emptyList(), Collections.emptyList(), Collections.emptyList()))
        .forEach(statementUpdate -> when(editor.editEntityDocument(Datamodel.makeMediaInfoUpdate((MediaInfoIdValue) doc.getEntityId(), doc.getRevisionId(), labelsUpdate, statementUpdate), false, summary, tags)).thenReturn(new EditingResult(revId++));