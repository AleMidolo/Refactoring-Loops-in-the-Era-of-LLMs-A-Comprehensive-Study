mentionedNewEntities.entrySet().stream()
    .forEach(entry -> {
        EntityIdValue missingId = entry.getKey();
        fullSchedule.add(new ItemEditBuilder(missingId)
            .addContributingRowIds(entry.getValue())
            .build());
        fullSchedule.addAll(pointerUpdates.get(missingId).getUpdates());
    });