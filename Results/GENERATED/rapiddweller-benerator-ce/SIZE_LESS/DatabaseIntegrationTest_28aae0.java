products.stream()
        .forEach(product -> assertNull(product.get("referee_id")));