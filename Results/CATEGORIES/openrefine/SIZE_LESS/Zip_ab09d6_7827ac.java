for (Spliterator<?> iterator : iterators) {
    if (!iterator.tryAdvance(e -> currentElements.add(e))) {
        done = true;
    }
}