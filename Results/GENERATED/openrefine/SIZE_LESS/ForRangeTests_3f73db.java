Arrays.stream(tests)
    .map(test -> MetaParser.parse("grel:" + test))
    .map(eval -> eval.evaluate(bindings))
    .forEach(result -> Assert.assertTrue(result instanceof EvalError));