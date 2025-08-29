products.stream()
        .map(product -> (String) product.get("text"))
        .forEach(uniqueTexts::add);