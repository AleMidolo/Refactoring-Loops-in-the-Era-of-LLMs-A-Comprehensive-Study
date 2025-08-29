for (FormatGuesser guesser : guessers) {
    betterFormat = guesser.guess(file, fileEncoding, bestFormat);
    if (betterFormat != null) {
        break;
    }
}