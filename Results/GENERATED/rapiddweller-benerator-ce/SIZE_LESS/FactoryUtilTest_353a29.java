IntStream.range(0, 10)
    .forEach(i -> {
        String message = generator.generate(wrapper).unwrap();
        StringTokenizer tokenizer = new StringTokenizer(message, " ");
        assertEquals(2, tokenizer.countTokens());
        assertTrue(salutations.contains(tokenizer.nextToken()));
        assertTrue(names.contains(tokenizer.nextToken()));
    });