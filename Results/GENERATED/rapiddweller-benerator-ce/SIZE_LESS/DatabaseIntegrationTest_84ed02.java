products.stream()
        .map(product -> (Integer) product.get("referee_id"))
        .forEach(ref -> assertTrue(ref == 2 || ref == 3));