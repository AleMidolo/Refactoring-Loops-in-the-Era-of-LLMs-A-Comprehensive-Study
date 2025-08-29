for (int i = 0; i < 1000; i++) {
    assertTrue(RegexUtil.matches(regex, gen.generate()));
}