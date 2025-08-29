IntStream.range(0, 100)
    .mapToObj(i -> generator.generate())
    .forEach(cnpj -> {
        assertEquals(18, cnpj.length());
        assertTrue(validator.valid(cnpj));
    });