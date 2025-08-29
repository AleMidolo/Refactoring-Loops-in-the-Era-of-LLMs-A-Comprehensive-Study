for (int i = 0; i < iterations; i++) {
    wrapper = generator.generate(wrapper);
    if (wrapper == null) {
        fail("Generator unavailable after " + i + " of " + iterations + " invocations");
    } else {
        counter.count(wrapper.unwrap());
    }
}