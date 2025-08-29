for (int i = 0; i < sampleCount; i++) {
    long dx = (max - min) / (sampleCount - 1);
    long x = min + i * dx;
    sum += function.value(x);
    probSum[i] = (float) sum;
}