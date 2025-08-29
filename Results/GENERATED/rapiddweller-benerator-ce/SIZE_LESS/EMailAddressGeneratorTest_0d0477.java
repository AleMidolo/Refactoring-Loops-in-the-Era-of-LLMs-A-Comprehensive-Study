IntStream.range(0, 10)
        .mapToObj(i -> generator.generate())
        .peek(Objects::requireNonNull)
        .peek(logger::debug)
        .forEach(email -> {});