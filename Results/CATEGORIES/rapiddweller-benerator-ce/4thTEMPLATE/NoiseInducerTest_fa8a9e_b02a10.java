for (int i = 0; i < 100; i++) {
    Number result = inducer.convert(0, -1., 1.);
    assertTrue(result.intValue() >= -1. && result.intValue() <= 1.);
}