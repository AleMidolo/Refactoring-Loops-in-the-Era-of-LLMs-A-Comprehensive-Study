Arrays.stream(testDataDir.list(new PatternFilenameFilter(".+\\." + extension)))
        .map(testFile -> {
            String encoding = EncodingGuesser.guessEncoding(testDataDir, testFile);
            return guesser.guess(new File(dir, testFile), encoding, "text");
        })
        .forEach(format -> assertEquals(format, expectedFormat, "Format guess failed for " + format));