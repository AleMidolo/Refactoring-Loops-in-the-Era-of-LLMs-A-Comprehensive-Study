IntStream.range(0, iterations)
        .forEach(i -> {
            wrapper = generator.generate(wrapper);
            if (wrapper == null) {
                fail("Generator unavailable after " + i + " of " + iterations + " invocations");
            } else {
                counter.count(wrapper.unwrap());
            }
        });