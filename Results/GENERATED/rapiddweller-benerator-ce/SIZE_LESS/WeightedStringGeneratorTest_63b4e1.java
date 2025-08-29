resultPercentEachString.stream()
  .forEach(i -> Assert.assertTrue(i >= weight[resultPercentEachString.indexOf(i)] - deviation && i <= weight[resultPercentEachString.indexOf(i)] + deviation));