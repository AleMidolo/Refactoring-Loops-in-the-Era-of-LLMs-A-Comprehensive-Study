for (int i = 0; i < n; i++) {
    wrapper = generator.generate(wrapper);
    if (wrapper == null) {
        fail("Generator unavailable after " + i + " of " + n + " invocations");
    } else {
        counter.count(wrapper.unwrap());
    }
}