IntStream.range(0, specialCount.length)
    .forEach(i -> assertTrue("Character '" + specialChars.get(i) + "' not found in products for " + locale, specialCount[i] > 0));