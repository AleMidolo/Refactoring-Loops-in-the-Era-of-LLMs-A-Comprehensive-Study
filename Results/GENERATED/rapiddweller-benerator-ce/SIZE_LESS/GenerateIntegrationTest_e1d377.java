IntStream.range(0, 3).forEach(i ->
    assertEquals("CONV_DUMMY", ((Entity) products.get(i)).type())
);