IntStream.range(0, n)
    .mapToObj(i -> generator.generate(wrapper))
    .peek(w -> assertNotNull("Generator has gone unavailable before creating the required number of products ", w))
    .map(Wrapper::unwrap)
    .peek(this::logProduct)
    .forEach(product -> assertTrue("'" + format(product) + "' is not unique. Generator is " + generator, validator.valid(product)));