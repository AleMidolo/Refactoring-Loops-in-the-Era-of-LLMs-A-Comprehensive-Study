for (int i = 0; i < n; i++) {
    wrapper = generator.generate(wrapper);
    assertNotNull("Generator is not available: " + generator, wrapper);
    T product = wrapper.unwrap();
    logProduct(product);
    assertTrue("Product is not unique: " + product, validator.valid(product));
}