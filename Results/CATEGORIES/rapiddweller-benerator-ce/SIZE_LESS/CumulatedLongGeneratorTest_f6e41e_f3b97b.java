for (int i = 0; i < n; i++) {
    int sample = g.generate().intValue();
    sampleCount[sample - min]++;
}