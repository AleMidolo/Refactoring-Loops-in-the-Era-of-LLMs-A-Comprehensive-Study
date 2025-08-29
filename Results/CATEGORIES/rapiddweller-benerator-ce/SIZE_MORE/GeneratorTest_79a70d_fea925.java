for (int i = 0; i < invocations; i++) {
    wrapper = generator.generate(wrapper);
    assertNotNull("Generator has gone unavailable. " + "Generated only " + i + " of " + expectedProducts.length + " expected values: " + observedSet, wrapper);
    T generation = wrapper.unwrap();
    logProduct(generation);
    assertTrue("The generated value '" + format(generation) + "' was not in the expected set: " + expectedSet, expectedSet.contains(generation));
    observedSet.add(generation);
}