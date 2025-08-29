IntStream.range(0, n)
    .forEach(i -> {
        wrapper = generator.generate(wrapper);
        assertNotNull("Generator is not available: " + generator, wrapper);
        T product = wrapper.unwrap();
        logProduct(product);
        assertTrue("Product is not unique: " + product, validator.valid(product));
    });