for (int i = 0; i < WHITESPACE.length(); i++) {
    String c = WHITESPACE.substring(i, i + 1);
    Assert.assertEquals((String) (invoke("trim", c + "foo" + c)), "foo", "Trim for whitespace char: '" + c + "' at index " + i + " failed");
}