IntStream.range(0, counts.length)
    .forEach(c -> {
        int count = counts[c];
        if (count == lineCount) {
            widths.add(c - startIndex + 1);
            startIndex = c + 1;
        }
    });