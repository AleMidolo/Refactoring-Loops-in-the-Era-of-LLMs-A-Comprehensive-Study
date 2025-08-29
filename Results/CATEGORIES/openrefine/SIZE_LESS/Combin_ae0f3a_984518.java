for (int i = 1; i <= n; i++) {
    IntStream.rangeClosed(1, k).forEach(j -> {
        binomial[i][j] = binomial[i - 1][j - 1] + binomial[i - 1][j];
        if (binomial[i][j] > Long.MAX_VALUE || binomial[i][j] < 0) {
            throw new RuntimeException("Range limit exceeded");
        }
    });
}