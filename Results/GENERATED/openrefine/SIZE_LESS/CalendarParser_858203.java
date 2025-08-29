return IntStream.range(0, MONTHS.length)
    .filter(i -> lstr.startsWith(MONTHS[i][0]) || MONTHS[i][1].toLowerCase().startsWith(lstr))
    .mapToObj(i -> i + 1)
    .findFirst()
    .orElse(-1);