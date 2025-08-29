for (int i = 0; i < sampleCount; i++) {
    value[i] = min + i * dx;
    sum += function.value(value[i]);
    probSum[i] = sum;
}