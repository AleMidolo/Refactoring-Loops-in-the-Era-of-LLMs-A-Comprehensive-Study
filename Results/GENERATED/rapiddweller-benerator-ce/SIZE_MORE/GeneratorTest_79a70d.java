IntStream.range(0, invocations)
    .mapToObj(i -> generator.generate(wrapper))
    .peek(wrapper -> assertNotNull("Generator has gone unavailable. " + "Generated only " + i + " of " + expectedProducts.length + " expected values: " + observedSet, wrapper))
    .map(wrapper -> wrapper.unwrap())
    .peek(generation -> logProduct(generation))
    .peek(generation -> assertTrue("The generated value '" + format(generation) + "' was not in the expected set: " + expectedSet, expectedSet.contains(generation)))
    .peek(observedSet::add)
    .count();