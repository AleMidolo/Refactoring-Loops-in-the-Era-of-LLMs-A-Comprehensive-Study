IntStream.range(1, n + 1)
    .forEach(i -> IntStream.range(1, k + 1)
        .forEach(j -> {
            binomial[i][j] = binomial[i - 1][j - 1] + binomial[i - 1][j];
            if (binomial[i][j] > Long.MAX_VALUE || binomial[i][j] < 0) {
                throw new RuntimeException("Range limit exceeded");
            }
        }));