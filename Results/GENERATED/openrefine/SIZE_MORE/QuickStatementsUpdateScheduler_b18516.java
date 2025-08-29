referencingUpdates.entrySet().stream()
    .map(entry -> entry.getValue().build())
    .forEach(pointerUpdate -> {
        EntityIdValue key = entry.getKey();
        UpdateSequence pointerUpdatesForKey = pointerUpdates.get(key);
        if (pointerUpdatesForKey == null) {
            pointerUpdatesForKey = new UpdateSequence();
        }
        pointerUpdatesForKey.add(pointerUpdate);
        pointerUpdates.put(key, pointerUpdatesForKey);
    });