for (Entity product : products) {
    assertTrue(Pattern.matches(regex, (String) product.get("text")));
}