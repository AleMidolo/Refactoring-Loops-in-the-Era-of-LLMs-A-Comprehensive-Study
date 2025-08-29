inputs.stream()
    .forEach(input -> Assert.assertEquals(invoke("encode", input[0], input[1]), input[2]));