for (long d : allValues) {
    int bin = (int) Math.max((d - _min) / _step, 0);
    _bins[bin]++;
}