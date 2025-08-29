IntStream.range(3, 6).forEach(i ->
    src.store(new Entity(descriptor, "id", i))
);