products.stream()
    .map(product -> product.get("referee_id"))
    .forEach(refereeId -> assertEquals(1, refereeId));