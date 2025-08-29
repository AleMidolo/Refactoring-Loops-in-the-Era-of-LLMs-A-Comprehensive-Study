for (int i = 0; i < n; i++) {
    if (generator.generate()) {
        count[1]++;
    } else {
        count[0]++;
    }
}