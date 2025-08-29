update.getStatementEdits().stream()
    .forEach(statement -> {
        Set<ReconEntityIdValue> pointers = extractor.extractPointers(statement.getStatement());
        if (pointers.isEmpty()) {
            remainingUpdateBuilder.addStatement(statement);
        } else if (pointers.size() == 1 && !update.isNew()) {
            EntityIdValue pointer = pointers.stream().findFirst().get();
            MediaInfoEditBuilder referencingBuilder = referencingUpdates.get(pointer);
            if (referencingBuilder == null) {
                referencingBuilder = new MediaInfoEditBuilder(update.getEntityId());
            }
            referencingBuilder.addStatement(statement);
            referencingUpdates.put(pointer, referencingBuilder);
        } else if (pointers.size() == 1 && pointers.stream().findFirst().get().equals(update.getEntityId())) {
            remainingUpdateBuilder.addStatement(statement);
        } else {
            throw new ImpossibleSchedulingException("A mediainfo entity refers to multiple new entities, which is not supported by QuickStatements");
        }
    });