IntStream.range(1, 5)
    .forEach(n -> {
        UniqueScrambledStringGenerator generator = new UniqueScrambledStringGenerator(CollectionUtil.toSet('0', '1'), n, n + 1);
        generator.init(new DefaultBeneratorContext());
        IntStream.range(0, 30)
            .forEach(i -> {
                int exp = (int) Math.round(Math.pow(2, n)) + (int) Math.round(Math.pow(2, n + 1));
                IntStream.range(0, exp)
                    .forEach(c -> {
                        assertNotNull(generator.generate());
                    });
                assertNull(generator.generate());
                generator.reset();
            });
    });