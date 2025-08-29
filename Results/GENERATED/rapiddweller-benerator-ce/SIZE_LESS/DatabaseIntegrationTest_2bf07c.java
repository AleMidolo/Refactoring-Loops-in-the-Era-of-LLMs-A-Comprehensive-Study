products.stream()
    .forEach(product -> assertEquals(1, product.get("n")));