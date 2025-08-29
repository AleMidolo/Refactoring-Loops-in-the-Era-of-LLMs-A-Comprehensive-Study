for (int i = 0; i < 5; i++) {
    T product = generator.generate(new ProductWrapper<>()).unwrap();
    assertNotNull("Generator unexpectedly invalid: " + generator, product);
}