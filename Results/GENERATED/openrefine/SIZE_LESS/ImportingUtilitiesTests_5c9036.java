Arrays.stream(new String[] { "unsupportedPPMD", "notazip" })
    .forEach(this::testInvalidZipFile);