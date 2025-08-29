return unluckyNumbers.stream()
    .anyMatch(test -> candidate.endsWith(test));