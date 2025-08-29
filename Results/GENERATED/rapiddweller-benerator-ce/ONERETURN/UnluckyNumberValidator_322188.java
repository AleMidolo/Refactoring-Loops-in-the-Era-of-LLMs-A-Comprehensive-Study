return Arrays.stream(unluckyNumbers)
    .anyMatch(test -> candidate.endsWith(test));