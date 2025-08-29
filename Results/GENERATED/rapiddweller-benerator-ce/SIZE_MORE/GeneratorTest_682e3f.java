IntStream.range(0, n)
    .forEach(i -> {
        wrapper = generator.generate(wrapper);
        assertNotNull("Generator has gone unavailable before creating the required number of products, " + "required " + n + " but was " + i, wrapper);
        T product = wrapper.unwrap();
        logProduct(format(product));
        validators.forEach(validator -> assertTrue("'" + format(product) + "' is not valid according to " + validator + ", failed after " + i + " generations", validator.valid(product)));
    });