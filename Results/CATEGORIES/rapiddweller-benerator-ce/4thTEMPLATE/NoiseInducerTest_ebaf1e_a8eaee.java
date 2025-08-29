for (int i = 0; i < 100; i++) {
    Number result = inducer.convert(0.);
    assertTrue(result.intValue() >= -2. && result.intValue() <= 2.);
}