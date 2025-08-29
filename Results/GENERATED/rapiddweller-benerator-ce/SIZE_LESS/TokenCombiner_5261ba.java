IntStream.range(0, tokens.length)
    .filter(i -> !unique || !sources[i].contains(tokens[i]))
    .forEach(i -> sources[i].addValue(tokens[i]));