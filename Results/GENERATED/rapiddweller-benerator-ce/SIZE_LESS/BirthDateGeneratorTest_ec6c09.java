IntStream.range(0, 1000)
        .mapToObj(i -> generator.generate())
        .map(birthDate -> TimeUtil.yearsBetween(birthDate, now))
        .forEach(age -> {
            assertTrue("Generated birth date is too new: " + birthDate, age >= 3);
            assertTrue("Generated birth date is too old: " + birthDate, age <= 12);
        });