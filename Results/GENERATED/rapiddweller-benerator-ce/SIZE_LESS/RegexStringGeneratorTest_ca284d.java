IntStream.range(0, 1000)
        .forEach(i -> assertTrue(RegexUtil.matches(regex, gen.generate()));