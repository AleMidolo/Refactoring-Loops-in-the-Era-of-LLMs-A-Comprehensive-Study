IntStream.range(0, count)
    .forEach(i -> {
        assertTrue(iterator.hasNext());
        T item = iterator.next();
        assertFalse(items.contains(item));
        items.add(item);
    });