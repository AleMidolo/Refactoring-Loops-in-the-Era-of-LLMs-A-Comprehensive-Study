for (Reference reference : added.getReferences()) {
    if (!seenReferences.contains(reference)) {
        seenReferences.add(reference);
        allReferences.add(reference);
    }
}