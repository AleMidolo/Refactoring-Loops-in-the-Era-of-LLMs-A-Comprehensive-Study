IntStream.range(0, number.length() - 1)
    .map(i -> number.charAt(i) - '0')
    .mapToObj(digit -> {
        int partialSum = digit * multiplier;
        return partialSum > 9 ? 1 + (partialSum % 10) : partialSum;
    })
    .forEach(partialSum -> {
        sum += partialSum;
        multiplier = 1 + (multiplier % 2);
    });