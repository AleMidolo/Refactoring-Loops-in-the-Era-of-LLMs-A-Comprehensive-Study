return unluckyNumbers.stream()
    .anyMatch(test -> candidate.contains(test));