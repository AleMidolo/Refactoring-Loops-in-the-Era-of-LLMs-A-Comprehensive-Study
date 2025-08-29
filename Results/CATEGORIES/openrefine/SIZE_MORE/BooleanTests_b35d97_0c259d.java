for (String op : new String[] { "and", "or", "xor" }) {
    Assert.assertTrue(invoke(op) instanceof EvalError);
    Assert.assertTrue(invoke(op, Boolean.TRUE, Integer.valueOf(1)) instanceof EvalError);
    Assert.assertTrue(invoke(op, Integer.valueOf(1), Boolean.TRUE) instanceof EvalError);
    Assert.assertTrue(invoke(op, Boolean.TRUE, "foo") instanceof EvalError);
    Assert.assertTrue(invoke(op, "foo", Boolean.TRUE) instanceof EvalError);
    Assert.assertTrue(invoke(op, Boolean.TRUE) instanceof EvalError);
}