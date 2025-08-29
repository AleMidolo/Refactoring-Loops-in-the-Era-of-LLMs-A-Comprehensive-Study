for (MediaInfoDocument doc : fullBatch) {
    StatementUpdate statementUpdate = Datamodel.makeStatementUpdate(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    when(editor.editEntityDocument(Datamodel.makeMediaInfoUpdate((MediaInfoIdValue) doc.getEntityId(), doc.getRevisionId(), labelsUpdate, statementUpdate), false, summary, tags)).thenReturn(new EditingResult(revId));
    revId++;
}