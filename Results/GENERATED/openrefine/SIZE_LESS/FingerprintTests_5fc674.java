Arrays.stream(testStrings)
    .forEach(ss -> {
        Assert.assertEquals(ss.length, 2, "Invalid test");
        Assert.assertEquals((String) (invoke("fingerprint", ss[0])), ss[1], "Fingerprint for string: " + ss[0] + " failed");
    });