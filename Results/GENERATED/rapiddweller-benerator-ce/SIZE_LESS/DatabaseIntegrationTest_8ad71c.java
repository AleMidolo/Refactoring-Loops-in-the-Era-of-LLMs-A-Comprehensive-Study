products.stream()
        .forEach(product -> assertEquals(2, product.get("referee_id")));