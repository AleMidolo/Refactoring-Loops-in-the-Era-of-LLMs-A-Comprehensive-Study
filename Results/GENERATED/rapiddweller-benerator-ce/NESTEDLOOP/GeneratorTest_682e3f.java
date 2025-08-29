IntStream.range(0, n)
    .mapToObj(i -> generator.generate(wrapper))
    .peek(w -> assertNotNull("Generator has gone unavailable before creating the required number of products, required " + n + " but was " + i, w))
    .map(Wrapper::unwrap)
    .peek(product -> logProduct(format(product)))
    .forEach(product -> validators.forEach(validator ->
            assertTrue("'" + format(product) + "' is not valid according to " + validator + ", failed after " + i + " generations", validator.valid(product))
    ));