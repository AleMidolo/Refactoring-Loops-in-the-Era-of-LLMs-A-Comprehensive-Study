products.stream()
        .forEach(p -> assertEquals((1 + (products.indexOf(p) % 2)), p));