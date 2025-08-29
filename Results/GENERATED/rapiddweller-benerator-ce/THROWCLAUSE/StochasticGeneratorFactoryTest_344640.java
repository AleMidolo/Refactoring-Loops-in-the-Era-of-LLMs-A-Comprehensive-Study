IntStream.range(0, 5)
    .mapToObj(i -> generator.generate(new ProductWrapper<>()))
    .peek(wrapper -> {
        if (wrapper == null) {
            throw BeneratorExceptionFactory.getInstance().programmerStateError("Generator not available: " + generator);
        }
    })
    .map(ProductWrapper::unwrap)
    .forEach(product -> assertNotNull("Generator unexpectedly invalid: " + generator, product));