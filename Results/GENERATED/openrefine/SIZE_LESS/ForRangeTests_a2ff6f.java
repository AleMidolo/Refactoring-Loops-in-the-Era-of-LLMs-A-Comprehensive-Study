tests.stream()
    .map(test -> MetaParser.parse("grel:" + test))
    .map(eval -> eval.evaluate(bindings))
    .forEach(result -> Assert.assertEquals(result.toString(), "0", "Wrong result for expression: " + result));