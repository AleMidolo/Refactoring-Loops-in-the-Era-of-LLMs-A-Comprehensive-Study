products.stream()
        .skip(1)
        .limit(products.size() - 2)
        .forEach(product -> assertEquals(new Transition(1, 1), product));