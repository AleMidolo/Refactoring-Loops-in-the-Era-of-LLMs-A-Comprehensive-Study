for (String[] ss : testNGramStrings) {
    Assert.assertEquals(ss.length, 2, "Invalid test");
    Assert.assertEquals(keyer.key(ss[0]), ss[1], "Fingerprint for string: " + ss[0] + " failed");
}