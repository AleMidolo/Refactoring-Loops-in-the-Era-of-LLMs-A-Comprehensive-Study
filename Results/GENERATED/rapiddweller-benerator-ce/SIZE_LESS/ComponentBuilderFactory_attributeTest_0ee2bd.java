IntStream.range(0, 10)
        .forEach(i -> {
            String actual = GeneratorUtil.generateNonNull(helper);
            assertEquals("Invalid product: ", "Alice", actual);
        });