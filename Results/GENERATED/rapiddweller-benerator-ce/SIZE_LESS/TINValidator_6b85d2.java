IntStream.range(0, 10)
    .forEach(i -> {
        int sum = (number.charAt(i) - '0' + product) % 10;
        if (sum == 0) {
            sum = 10;
        }
        product = (sum * 2) % 11;
    });