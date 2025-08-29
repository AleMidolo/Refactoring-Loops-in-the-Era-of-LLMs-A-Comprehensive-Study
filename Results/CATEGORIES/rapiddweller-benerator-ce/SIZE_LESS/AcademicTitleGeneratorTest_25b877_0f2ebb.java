for (int i = 0; i < n; i++) {
    String title = gen.generate(new ProductWrapper<>()).unwrap();
    if (title != null) {
        titleUsedCount++;
        assertTrue(GERMAN_TITLES.contains(title));
    }
}