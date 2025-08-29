for (String[] ss : testStrings) {
    Assert.assertEquals(ss.length, 2, "Invalid test");
    Assert.assertEquals(keyer.key(ss[0]), ss[1], "User defined keying for string: " + ss[0] + " failed");
}