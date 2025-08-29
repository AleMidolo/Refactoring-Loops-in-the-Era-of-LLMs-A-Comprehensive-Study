IntStream.range(0, sampleCount.length)
    .forEach(i -> {
        int count = sampleCount[i];
        double measuredProbability = (float) count / n;
        double expectedProbability = samples2.get(i).getWeight();
        double ratio = measuredProbability / expectedProbability;
        if (logger.isDebugEnabled()) {
            logger.debug(i + " " + count + " " + ratio);
        }
        assertTrue(ratio > 0.9 && ratio < 1.1);
    });