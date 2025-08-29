referencingUpdates.entrySet().stream()
    .map(entry -> entry.getValue().build())
    .forEach(pointerUpdate -> {
        UpdateSequence pointerUpdatesForKey = pointerUpdates.get(entry.getKey());
        if (pointerUpdatesForKey == null) {
            pointerUpdatesForKey = new UpdateSequence();
            pointerUpdates.put(entry.getKey(), pointerUpdatesForKey);
        }
        pointerUpdatesForKey.add(pointerUpdate);
    });