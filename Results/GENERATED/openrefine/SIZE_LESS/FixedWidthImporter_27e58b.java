IntStream.range(0, counts.length)
    .filter(c -> counts[c] == lineCount)
    .forEach(c -> {
        widths.add(c - startIndex + 1);
        startIndex = c + 1;
    });