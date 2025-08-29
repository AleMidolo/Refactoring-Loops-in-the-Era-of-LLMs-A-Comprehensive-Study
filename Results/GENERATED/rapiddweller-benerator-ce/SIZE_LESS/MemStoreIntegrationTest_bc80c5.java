products.stream()
        .forEach(product -> {
            assertNotNull(product);
            assertEquals(index, product.get("id"));
            index++;
        });