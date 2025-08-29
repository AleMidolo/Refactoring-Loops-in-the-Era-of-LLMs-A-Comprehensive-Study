for (Entry<EntityIdValue, MediaInfoEditBuilder> entry : referencingUpdates.entrySet()) {
    MediaInfoEdit pointerUpdate = entry.getValue().build();
    UpdateSequence pointerUpdatesForKey = pointerUpdates.get(entry.getKey());
    if (pointerUpdatesForKey == null) {
        pointerUpdatesForKey = new UpdateSequence();
    }
    pointerUpdatesForKey.add(pointerUpdate);
    pointerUpdates.put(entry.getKey(), pointerUpdatesForKey);
}