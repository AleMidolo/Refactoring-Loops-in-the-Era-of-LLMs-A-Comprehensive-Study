update.getStatementEdits().stream()
    .forEach(statement -> {
        Set<ReconEntityIdValue> pointers = extractor.extractPointers(statement.getStatement());
        if (pointers.isEmpty()) {
            pointerFreeBuilder.addStatement(statement);
        } else {
            pointerFullBuilder.addStatement(statement);
        }
        pointers.stream().forEach(pointer -> allPointers.put(pointer, rowId));
    });