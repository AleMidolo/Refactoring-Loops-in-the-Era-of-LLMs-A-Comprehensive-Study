IntStream.range(0, 10)
         .forEach(i -> assertEquals("OK", GeneratorUtil.generateNonNull(helper)));