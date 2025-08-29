IntStream.range(0, iterations)
    .mapToObj(i -> generator.generate(wrapper))
    .peek(tmp -> {
        if (tmp == null) {
            fail(iterations + " iterations requested, but generator is depleted after " + i + " iterations");
        } else {
            counter.count(tmp.unwrap());
        }
    })
    .count();