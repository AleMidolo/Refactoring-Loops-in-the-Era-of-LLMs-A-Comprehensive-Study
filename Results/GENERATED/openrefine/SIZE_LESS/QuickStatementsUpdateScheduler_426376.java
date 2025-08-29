mentionedNewEntities.entrySet().stream()
    .map(entry -> {
        EntityIdValue missingId = entry.getKey();
        return new ItemEditBuilder(missingId)
                .addContributingRowIds(entry.getValue())
                .build();
    })
    .forEach(fullSchedule::add);
        
mentionedNewEntities.entrySet().stream()
    .map(entry -> pointerUpdates.get(entry.getKey()).getUpdates())
    .forEach(fullSchedule::addAll);