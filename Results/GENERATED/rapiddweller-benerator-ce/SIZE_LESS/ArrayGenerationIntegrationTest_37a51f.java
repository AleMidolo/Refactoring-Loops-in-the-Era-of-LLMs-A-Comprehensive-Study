products.stream()
            .forEach(product -> {
                assertEquals(2, product.length);
                assertEquals(3, product[0]);
                assertEquals("x", product[1]);
            });