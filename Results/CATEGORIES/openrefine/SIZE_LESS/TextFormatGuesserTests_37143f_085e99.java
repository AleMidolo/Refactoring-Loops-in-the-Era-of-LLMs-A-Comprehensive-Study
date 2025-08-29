for (String testFile : testDataDir.list(new PatternFilenameFilter(".+\\." + extension))) {
    String encoding = EncodingGuesser.guessEncoding(testDataDir, testFile);
    String format = guesser.guess(new File(dir, testFile), encoding, "text");
    assertEquals(format, expectedFormat, "Format guess failed for " + testFile);
}