products.stream()
        .map(product -> (String) product.get("text"))
        .peek(System.out::println)
        .forEach(text -> assertTrue(Pattern.matches(regex, text)));