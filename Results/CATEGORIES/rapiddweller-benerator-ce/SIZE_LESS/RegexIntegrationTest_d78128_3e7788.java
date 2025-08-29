for (Entity product : products) {
    String text = (String) product.get("text");
    System.out.println(text);
    assertTrue(Pattern.matches(regex, text));
}