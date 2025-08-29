IntStream.range(0, 1000)
         .mapToObj(i -> generator.generate())
         .forEach(ssn -> assertTrue("Invalid SSN: " + ssn, validator.isValid(ssn, null));