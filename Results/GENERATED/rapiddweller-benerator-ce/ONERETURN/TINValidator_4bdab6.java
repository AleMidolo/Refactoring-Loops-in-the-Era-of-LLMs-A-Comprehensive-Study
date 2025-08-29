IntStream.range(0, 10)
        .map(i -> number.charAt(i) - '0')
        .peek(digit -> {
            if (!digitUsed[digit]) {
                digitUsed[digit] = true;
            } else {
                doubleCount++;
                if (doubleCount == 2) {
                    throw new RuntimeException();
                }
            }
        }).forEach(i -> {});