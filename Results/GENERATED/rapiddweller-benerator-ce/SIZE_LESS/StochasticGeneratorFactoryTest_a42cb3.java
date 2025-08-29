IntStream.range(0, 10)
    .forEach(i -> {
        Object[] array = generator.generate(wrapper).unwrap();
        assertEquals(2, array.length);
        assertTrue(salutations.contains(array[0]));
        assertTrue(names.contains(array[1]));
    });