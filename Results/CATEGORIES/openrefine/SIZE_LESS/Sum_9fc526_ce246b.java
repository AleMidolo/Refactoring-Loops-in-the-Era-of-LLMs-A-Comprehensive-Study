for (int i = 0; i < length; i++) {
    Object n = a[length - i - 1];
    if (n instanceof Number) {
        total += ((Number) n).doubleValue();
    }
}