for (int i = 0; i < n; i++) {
    wrapper = gen.generate(wrapper);
    assertNotNull(wrapper);
    assertNull(wrapper.unwrap());
}