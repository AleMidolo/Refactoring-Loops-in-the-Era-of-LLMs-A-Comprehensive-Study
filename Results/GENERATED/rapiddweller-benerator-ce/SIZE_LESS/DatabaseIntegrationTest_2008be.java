products.stream()
        .forEach(product -> assertEquals(3, product.get("referee_id")));