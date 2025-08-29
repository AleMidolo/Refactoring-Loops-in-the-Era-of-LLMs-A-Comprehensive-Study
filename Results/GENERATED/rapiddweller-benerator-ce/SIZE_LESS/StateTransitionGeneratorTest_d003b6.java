products.stream()
        .skip(1)
        .limit(products.size() - 2)
        .forEach(i -> {
            int oldState = 1 + ((i - 1) % 2);
            int newState = 1 + (i % 2);
            assertEquals(new Transition(oldState, newState), products.get(i));
        });