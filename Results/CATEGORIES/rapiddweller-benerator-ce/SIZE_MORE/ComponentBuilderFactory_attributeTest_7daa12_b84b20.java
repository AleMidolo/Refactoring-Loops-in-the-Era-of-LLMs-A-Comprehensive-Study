for (int i = 0; i < n; i++) {
    ProductWrapper<Object> productWrapper = gen.generate(wrapper);
    assertNotNull("Generator unavailable in generation #" + i, productWrapper);
    Object product = productWrapper.unwrap();
    String errMsg = "Unexpected product: " + product;
    if (product != null) {
        errMsg += " (of " + product.getClass() + ")";
    }
    assertTrue(errMsg, singleValidator.valid(product));
    products.add(product);
}