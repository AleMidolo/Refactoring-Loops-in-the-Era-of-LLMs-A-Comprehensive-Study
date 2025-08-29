for (String test : tests) {
    Evaluable eval = MetaParser.parse("grel:" + test);
    Object result = eval.evaluate(bindings);
    Assert.assertTrue(result instanceof EvalError);
}