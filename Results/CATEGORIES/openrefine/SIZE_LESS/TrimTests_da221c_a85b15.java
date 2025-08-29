for (String[] ss : testStrings) {
    Assert.assertEquals(ss.length, 2, "Invalid test");
    Assert.assertEquals((String) (invoke("trim", ss[0])), ss[1], "Trim for string: " + ss + " failed");
}