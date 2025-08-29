IntStream.range(0, Math.min(counts.length, s.length()))
    .forEach(c -> {
        char ch = s.charAt(c);
        if (ch == ' ') {
            counts[c]++;
        }
    });