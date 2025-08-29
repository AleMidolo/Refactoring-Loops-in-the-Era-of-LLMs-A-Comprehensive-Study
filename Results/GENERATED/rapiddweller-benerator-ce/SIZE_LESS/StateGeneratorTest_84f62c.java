products.stream()
        .forEach(i -> assertEquals((1 + (products.indexOf(i) % 2)), i.intValue()));