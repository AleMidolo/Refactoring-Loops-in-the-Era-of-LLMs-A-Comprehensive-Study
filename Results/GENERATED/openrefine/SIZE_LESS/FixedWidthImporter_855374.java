IntStream.range(0, Math.min(counts.length, s.length()))
    .filter(c -> s.charAt(c) == ' ')
    .forEach(c -> counts[c]++);