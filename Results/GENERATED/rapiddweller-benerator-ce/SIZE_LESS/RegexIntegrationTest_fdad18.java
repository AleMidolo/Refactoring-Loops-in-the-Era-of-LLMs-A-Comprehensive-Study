products.stream()
    .map(product -> (String) product.get("text"))
    .forEach(text -> assertTrue(Pattern.matches(regex, text));