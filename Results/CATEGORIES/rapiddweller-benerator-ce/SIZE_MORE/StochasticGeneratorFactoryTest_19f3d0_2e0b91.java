for (int i = 0; i < 30; i++) {
    wrapper = generator.generate(wrapper);
    if (wrapper == null)
        break;
    T n = wrapper.unwrap();
    assertNotNull("Generator not available: " + generator, n);
    if (min != null) {
        assertTrue("Generated value (" + n + ") is smaller than min (" + min + ") using sequence '" + sequence + "'", n.doubleValue() >= min.doubleValue());
    }
    if (max != null) {
        assertTrue(n.doubleValue() <= max.doubleValue());
    }
}