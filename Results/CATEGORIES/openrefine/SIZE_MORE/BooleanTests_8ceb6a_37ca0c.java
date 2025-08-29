for (String[] test : TRUTH_TABLE) {
    String operator = test[0];
    Boolean op1 = Boolean.valueOf(test[1]);
    Boolean op2 = Boolean.valueOf(test[2]);
    Boolean op3 = Boolean.valueOf(test[3]);
    Boolean result = Boolean.valueOf(test[4]);
    Assert.assertEquals(invoke(operator, op1, op2, op3), result);
}