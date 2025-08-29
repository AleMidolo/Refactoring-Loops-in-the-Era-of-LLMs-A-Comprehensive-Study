fullBatch.stream()
        .forEach(doc -> verify(editor, times(1)).editEntityDocument(
                Datamodel.makeItemUpdate(doc.getEntityId(), doc.getRevisionId(),
                        Datamodel.makeTermUpdate(Collections.emptyList(), Collections.emptyList()),
                        Datamodel.makeTermUpdate(Collections.singletonList(description), Collections.emptyList()),
                        Collections.emptyMap(),
                        Datamodel.makeStatementUpdate(Collections.emptyList(), Collections.emptyList(), Collections.emptyList()),
                        Collections.emptyList(),
                        Collections.emptyList()), false, summary, tags));