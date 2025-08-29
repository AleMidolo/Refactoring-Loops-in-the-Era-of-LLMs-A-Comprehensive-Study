for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= k; j++) {
        binomial[i][j] = binomial[i - 1][j - 1] + binomial[i - 1][j];
        if (binomial[i][j] > Long.MAX_VALUE || binomial[i][j] < 0) {
            throw new RuntimeException("Range limit exceeded");
        }
    }
}