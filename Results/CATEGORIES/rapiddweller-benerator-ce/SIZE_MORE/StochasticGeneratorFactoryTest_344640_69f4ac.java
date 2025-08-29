for (int i = 0; i < 5; i++) {
    ProductWrapper<T> wrapper = generator.generate(new ProductWrapper<>());
    if (wrapper == null) {
        throw BeneratorExceptionFactory.getInstance().programmerStateError("Generator not available: " + generator);
    }
    T product = wrapper.unwrap();
    assertNotNull("Generator unexpectedly invalid: " + generator, product);
}