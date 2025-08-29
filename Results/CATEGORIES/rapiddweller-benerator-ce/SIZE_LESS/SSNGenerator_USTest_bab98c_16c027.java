for (int i = 0; i < 1000; i++) {
    String ssn = generator.generate();
    assertTrue("Invalid SSN: " + ssn, validator.isValid(ssn, null));
}