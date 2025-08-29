for (int i = 0; i < count; i++) {
    assertTrue(iterator.hasNext());
    T item = iterator.next();
    assertFalse(items.contains(item));
    items.add(item);
}