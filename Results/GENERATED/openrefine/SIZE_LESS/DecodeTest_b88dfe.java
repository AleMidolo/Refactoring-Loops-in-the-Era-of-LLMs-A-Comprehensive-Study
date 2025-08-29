inputs.stream()
        .forEach(input -> {
            String string = input[2];
            String encoding = input[1];
            String expected = input[0];
            Assert.assertEquals(invoke("decode", string, encoding), expected);
        });