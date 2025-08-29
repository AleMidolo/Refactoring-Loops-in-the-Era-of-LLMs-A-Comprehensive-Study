for (Entry<EntityIdValue, Set<Integer>> entry : mentionedNewEntities.entrySet()) {
    EntityIdValue missingId = entry.getKey();
    fullSchedule.add(new ItemEditBuilder(missingId).addContributingRowIds(entry.getValue()).build());
    fullSchedule.addAll(pointerUpdates.get(missingId).getUpdates());
}