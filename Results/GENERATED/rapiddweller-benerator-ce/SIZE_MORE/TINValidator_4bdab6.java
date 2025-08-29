IntStream.range(0, 10)
    .map(i -> number.charAt(i) - '0')
    .mapToObj(digit -> {
        if (!digitUsed[digit]) {
            digitUsed[digit] = true;
            return false;
        } else {
            doubleCount++;
            return doubleCount == 2;
        }
    })
    .anyMatch(result -> result);