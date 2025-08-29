added.getReferences().stream()
    .filter(reference -> !seenReferences.contains(reference))
    .forEach(reference -> {
        seenReferences.add(reference);
        allReferences.add(reference);
    });