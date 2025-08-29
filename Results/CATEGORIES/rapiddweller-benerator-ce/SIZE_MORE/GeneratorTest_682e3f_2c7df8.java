for (int i = 0; i < n; i++) {
    wrapper = generator.generate(wrapper);
    assertNotNull("Generator has gone unavailable before creating the required number of products, " + "required " + n + " but was " + i, wrapper);
    T product = wrapper.unwrap();
    logProduct(format(product));
    for (Validator<T> validator : validators) {
        assertTrue("'" + format(product) + "' is not valid according to " + validator + ", failed after " + i + " generations", validator.valid(product));
    }
}