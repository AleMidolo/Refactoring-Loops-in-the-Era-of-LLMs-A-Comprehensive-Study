IntStream.range(2, tokens.length)
    .forEach(i -> {
        if (i > 2) {
            result.append(' ');
        }
        result.append(tokens[i]);
    });