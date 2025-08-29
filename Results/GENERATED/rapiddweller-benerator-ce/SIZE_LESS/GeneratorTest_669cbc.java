IntStream.range(0, n)
    .forEach(i -> {
        wrapper = generator.generate(wrapper);
        assertNotNull(wrapper);
        T product = wrapper.unwrap();
        assertTrue("Generated value (" + product + ") is less than the configured minimum (" + min + ")", min.compareTo(product) <= 0);
        assertTrue("Generated value (" + product + ") is greater than the configured maximum (" + max + ")", max.compareTo(product) >= 0);
    });