iterators.stream()
    .forEach(iterator -> {
        if (!iterator.tryAdvance(e -> currentElements.add(e))) {
            done = true;
        }
    });