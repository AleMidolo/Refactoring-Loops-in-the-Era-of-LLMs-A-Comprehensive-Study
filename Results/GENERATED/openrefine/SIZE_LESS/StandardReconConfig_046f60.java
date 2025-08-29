long common = shortWords.stream()
    .filter(word -> longWords.contains(word))
    .count();