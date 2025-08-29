IntStream.range(0, 1000)
         .forEach(i -> {
             String number = generator.generate();
             assertTrue(validator.isValid(number, null));
         });