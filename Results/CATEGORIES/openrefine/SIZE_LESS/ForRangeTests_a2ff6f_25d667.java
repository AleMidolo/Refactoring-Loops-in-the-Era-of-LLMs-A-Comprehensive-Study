for (String test : tests) {
    Evaluable eval = MetaParser.parse("grel:" + test);
    Object result = eval.evaluate(bindings);
    Assert.assertEquals(result.toString(), "0", "Wrong result for expression: " + test);
}