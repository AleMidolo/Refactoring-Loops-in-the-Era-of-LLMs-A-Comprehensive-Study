IntStream.range(0, 20)
    .forEach(i -> {
        String product = generator.generate();
        switch (product.indexOf(' ')) {
            case 2: alt1 = true; break;
            case 3: alt2 = true; break;
            default: fail("Regex generation failed for " + pattern);
        }
        logger.debug(product);
    });