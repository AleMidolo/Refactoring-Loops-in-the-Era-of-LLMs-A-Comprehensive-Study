for (String test : tests) {
    Evaluable eval = MetaParser.parse("grel:" + test);
    Object result = eval.evaluate(bindings);
    Assert.assertEquals(result.toString(), "", "Wrong result for expression: " + test);
}