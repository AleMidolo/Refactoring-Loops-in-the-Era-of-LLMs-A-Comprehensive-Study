IntStream.range(0, n)
    .mapToObj(i -> {
        ProductWrapper<Object> productWrapper = gen.generate(wrapper);
        assertNotNull("Generator unavailable in generation #" + i, productWrapper);
        Object product = productWrapper.unwrap();
        String errMsg = "Unexpected product: " + product;
        if (product != null) {
            errMsg += " (of " + product.getClass() + ")";
        }
        assertTrue(errMsg, singleValidator.valid(product));
        return product;
    })
    .forEach(products::add);