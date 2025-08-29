update.getStatementEdits().stream()
        .forEach(statement -> {
            Set<ReconEntityIdValue> pointers = extractor.extractPointers(statement.getStatement());
            if (pointers.isEmpty()) {
                remainingUpdateBuilder.addStatement(statement);
            } else if (pointers.size() == 1 && !update.isNew()) {
                EntityIdValue pointer = pointers.stream().findFirst().get();
                ItemEditBuilder referencingBuilder = referencingUpdates.get(pointer);
                if (referencingBuilder == null) {
                    referencingBuilder = new ItemEditBuilder(update.getEntityId()).addContributingRowIds(update.getContributingRowIds());
                }
                referencingBuilder.addStatement(statement);
                referencingUpdates.put(pointer, referencingBuilder);
            } else if (pointers.size() == 1 && pointers.stream().findFirst().get().equals(update.getEntityId())) {
                remainingUpdateBuilder.addStatement(statement);
            } else {
                throw new ImpossibleSchedulingException("An item refers to multiple new entities, which is not supported by QuickStatements");
            }
        });