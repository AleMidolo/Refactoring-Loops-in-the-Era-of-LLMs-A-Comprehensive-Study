IntStream.range(0, 100)
    .mapToObj(i -> generator.generate())
    .forEach(cpf -> {
        assertEquals(14, cpf.length());
        assertTrue(validator.valid(cpf));
    });