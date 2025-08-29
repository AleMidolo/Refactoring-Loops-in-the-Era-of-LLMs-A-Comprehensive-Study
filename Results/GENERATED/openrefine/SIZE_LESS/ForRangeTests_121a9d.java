Arrays.stream(tests)
    .map(test -> MetaParser.parse("grel:" + test))
    .map(eval -> eval.evaluate(bindings))
    .forEach(result -> Assert.assertEquals(result.toString(), "", "Wrong result for expression: " + test));