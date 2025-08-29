for (int i = 0; i <= sampleCount.length / 2; i++) {
    int c1 = sampleCount[i];
    int c2 = sampleCount[sampleCount.length - 1 - i];
    int threshold = n * 2 / sampleCount.length / sampleCount.length;
    if (c1 > threshold && c2 > threshold) {
        float ratio = (float) c1 / c2;
        boolean check = (ratio > 0.8 && ratio < 1.2);
        logger.debug((i + " " + c1 + " " + ratio + " " + check));
        assertTrue("Distribution expected to be symmetric", check);
    }
}