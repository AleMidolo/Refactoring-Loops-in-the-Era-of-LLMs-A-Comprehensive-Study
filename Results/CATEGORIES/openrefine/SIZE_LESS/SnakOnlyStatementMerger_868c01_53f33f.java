for (Reference reference : added) {
    if (!seenReferences.contains(reference)) {
        seenReferences.add(reference);
        allReferences.add(reference);
    }
}