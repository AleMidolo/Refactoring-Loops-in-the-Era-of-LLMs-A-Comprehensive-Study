for (int i = 0; i < specialCount.length; i++) {
    assertTrue("Character '" + specialChars.get(i) + "' not found in products for " + locale, specialCount[i] > 0);
}