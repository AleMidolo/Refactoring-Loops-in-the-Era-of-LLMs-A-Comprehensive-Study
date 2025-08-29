Arrays.stream(expectedProducts)
    .forEach(i -> {
        wrapper = generator.generate(wrapper);
        assertNotNull("Generator has gone unavailable after " + i + " products, " + "expected " + expectedProducts.length + " products. ", wrapper);
        T product = wrapper.unwrap();
        logProduct(format(product));
        assertTrue("Product is not unique: " + product, validator.valid(product));
        assertTrue("'" + format(product) + "' was not in the expected set: " + format(expectedSet), expectedSet.contains(product));
    });