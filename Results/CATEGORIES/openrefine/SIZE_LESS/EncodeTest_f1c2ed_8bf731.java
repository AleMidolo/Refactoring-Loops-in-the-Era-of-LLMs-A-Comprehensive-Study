for (String[] input : inputs) {
    String string = input[0];
    String encoding = input[1];
    String expected = input[2];
    Assert.assertEquals(invoke("encode", string, encoding), expected);
}