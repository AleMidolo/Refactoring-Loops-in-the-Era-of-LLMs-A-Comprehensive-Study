IntStream.range(0, 5)
        .forEach(i -> {
            T product = generator.generate(new ProductWrapper<>()).unwrap();
            assertNotNull("Generator unexpectedly invalid: " + generator, product);
        });