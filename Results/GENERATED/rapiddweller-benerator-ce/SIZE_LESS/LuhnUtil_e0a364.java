IntStream.range(0, number.length() - 1)
    .map(i -> number.charAt(number.length() - 2 - i) - '0')
    .mapToObj(digit -> {
        int partialSum = digit * multiplier;
        multiplier = 1 + (multiplier % 2);
        return partialSum > 9 ? 1 + (partialSum % 10) : partialSum;
    })
    .forEach(partialSum -> sum += partialSum);