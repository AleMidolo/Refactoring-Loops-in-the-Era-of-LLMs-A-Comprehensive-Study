for (double d : allValues) {
    int bin = Math.max((int) Math.floor((d - _min) / _step), 0);
    _bins[bin]++;
}