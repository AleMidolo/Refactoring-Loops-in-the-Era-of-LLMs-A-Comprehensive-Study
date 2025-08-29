for (int i = 0; i < resultPercentEachString.size(); i++) {
    Assert.assertTrue(resultPercentEachString.get(i) >= weight[i] - deviation && resultPercentEachString.get(i) <= weight[i] + deviation);
}