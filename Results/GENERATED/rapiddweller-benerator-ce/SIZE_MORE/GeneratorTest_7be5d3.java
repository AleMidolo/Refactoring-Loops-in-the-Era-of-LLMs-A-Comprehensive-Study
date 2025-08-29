IntStream.range(0, n)
    .mapToObj(i -> generator.generate(wrapper))
    .peek(w -> {
        if (w == null) {
            fail("Generator unavailable after " + i + " of " + n + " invocations");
        } else {
            counter.count(w.unwrap());
        }
    })
    .count();