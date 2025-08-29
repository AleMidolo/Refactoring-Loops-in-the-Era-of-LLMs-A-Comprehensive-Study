for (int i = 0; i < n; i++) {
    wrapper = generator.generate(wrapper);
    assertNotNull("Generator has gone unavailable before creating the required number of products ", wrapper);
    T product = wrapper.unwrap();
    logProduct(product);
    assertTrue("'" + format(product) + "' is not unique. Generator is " + generator, validator.valid(product));
}