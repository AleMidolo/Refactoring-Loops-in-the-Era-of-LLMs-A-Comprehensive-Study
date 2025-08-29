for (int i = 0; i < 1000; i++) {
    assertTrue(dateGenerator.generate().compareTo(maxDate) <= 0);
}