IntStream.range(0, n).forEach(i -> {
    if (generator.generate()) {
        count[1]++;
    } else {
        count[0]++;
    }
});