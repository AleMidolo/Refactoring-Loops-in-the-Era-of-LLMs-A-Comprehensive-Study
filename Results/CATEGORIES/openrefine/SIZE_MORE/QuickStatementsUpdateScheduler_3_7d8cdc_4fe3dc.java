for (EntityEdit update : pointerFreeUpdates.getUpdates()) {
    fullSchedule.add(update);
    UpdateSequence backPointers = pointerUpdates.get(update.getEntityId());
    if (backPointers != null) {
        fullSchedule.addAll(backPointers.getUpdates());
    }
    mentionedNewEntities.remove(update.getEntityId());
}