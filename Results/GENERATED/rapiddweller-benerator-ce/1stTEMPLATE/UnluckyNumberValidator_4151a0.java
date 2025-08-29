return Arrays.stream(luckyNumbers)
    .anyMatch(test -> candidate.contains(test));