FormatGuesser betterFormat = Arrays.stream(guessers)
    .map(guesser -> guesser.guess(file, fileEncoding, bestFormat))
    .filter(Objects::nonNull)
    .findFirst()
    .orElse(null);