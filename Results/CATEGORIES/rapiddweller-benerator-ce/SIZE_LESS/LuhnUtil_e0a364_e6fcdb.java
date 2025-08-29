for (int i = number.length() - 2; i >= 0; i--) {
    int digit = number.charAt(i) - '0';
    int partialSum = digit * multiplier;
    sum += (partialSum > 9 ? 1 + (partialSum % 10) : partialSum);
    multiplier = 1 + (multiplier % 2);
}