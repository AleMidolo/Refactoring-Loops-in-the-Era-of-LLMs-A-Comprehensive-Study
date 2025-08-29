for (String test : tests) {
    assertThrows("Expression failed to generate parse syntax error: " + test, ParsingException.class, () -> MetaParser.parse("grel:" + test));
}