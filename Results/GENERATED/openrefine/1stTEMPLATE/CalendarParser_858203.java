return IntStream.range(0, MONTHS.length)
        .filter(i -> lstr.startsWith(MONTHS[i][0]) || MONTHS[i][1].toLowerCase().startsWith(lstr))
        .findFirst()
        .orElse(-1) + 1;