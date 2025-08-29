IntStream.range(0, sampleCount.length / 2)
    .filter(i -> sampleCount[i] > n * 2 / sampleCount.length / sampleCount.length 
            && sampleCount[sampleCount.length - 1 - i] > n * 2 / sampleCount.length / sampleCount.length)
    .mapToObj(i -> {
        int c1 = sampleCount[i];
        int c2 = sampleCount[sampleCount.length - 1 - i];
        float ratio = (float) c1 / c2;
        boolean check = (ratio > 0.8 && ratio < 1.2);
        logger.debug((i + " " + c1 + " " + ratio + " " + check));
        assertTrue("Distribution expected to be symmetric", check);
        return null;
    })
    .collect(Collectors.toList());