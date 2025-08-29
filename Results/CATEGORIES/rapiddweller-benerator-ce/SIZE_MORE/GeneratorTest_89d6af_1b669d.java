for (int i = 0; i < expectedValueWeightPairs.length; i += 2) {
    Object value = expectedValueWeightPairs[i];
    if (totalExpectedWeight == 0) {
        totalExpectedWeight = 0.00000001;
    }
    double expectedWeight = ((Number) expectedValueWeightPairs[i + 1]).doubleValue() / totalExpectedWeight;
    if (expectedWeight > 0) {
        assertTrue("Generated set does not contain value " + value, productSet.contains(value));
        double measuredWeight = counter.getRelativeCount(value);
        assertTrue("For value '" + value + "', weight " + expectedWeight + " is expected, but it is " + measuredWeight, Math.abs(measuredWeight - expectedWeight) / expectedWeight < 0.20);
    } else {
        assertFalse("Generated contains value " + value + " though it has zero weight", productSet.contains(value));
    }
}