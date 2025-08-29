boolean isValidNumber(String number) {
    int sum = IntStream.range(0, number.length())
            .mapToObj(number::charAt)
            .filter(c -> !Character.isDigit(c))
            .findFirst()
            .map(c -> false)
            .orElseGet(() -> IntStream.range(0, number.length())
                    .mapToObj(number::charAt)
                    .mapToInt(c -> (c - '0') * (1 + (number.indexOf(c) % 2) * 2))
                    .sum());

    return sum % 10 == 0;
}