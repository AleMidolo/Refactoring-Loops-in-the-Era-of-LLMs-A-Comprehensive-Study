IntStream.range(0, 5)
    .mapToObj(i -> generator.generate())
    .peek(id -> {
        assertEquals(36, id.length());
        assertEquals('-', id.charAt(8));
        assertEquals('-', id.charAt(17));
        assertEquals('-', id.charAt(22));
        assertEquals('-', id.charAt(31));
        logger.debug(id);
    })
    .collect(Collectors.toList());