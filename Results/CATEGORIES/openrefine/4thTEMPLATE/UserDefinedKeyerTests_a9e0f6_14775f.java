for (String s : strs) {
    String output = keyer.key(s);
    Assert.assertEquals(output, s + " world", "User defined keying for string: " + s + " failed");
}