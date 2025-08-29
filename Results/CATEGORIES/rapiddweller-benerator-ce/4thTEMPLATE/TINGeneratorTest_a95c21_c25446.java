for (int i = 0; i < 1000; i++) {
    String number = generator.generate();
    assertTrue(validator.isValid(number, null));
}