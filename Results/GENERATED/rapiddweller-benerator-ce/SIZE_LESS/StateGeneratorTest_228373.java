products.stream()
        .forEachIndexed((i, p) -> assertEquals((1 + (i % 2)), p));