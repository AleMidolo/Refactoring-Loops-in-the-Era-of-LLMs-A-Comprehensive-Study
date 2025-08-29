IntStream.range(0, 1000)
    .forEach(i -> {
        String ssn = generator.generate();
        assertTrue("Invalid SSN: " + ssn, validator.isValid(ssn, null));
    });