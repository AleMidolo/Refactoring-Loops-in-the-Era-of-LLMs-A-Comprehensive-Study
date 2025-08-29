IntStream.range(0, s.length())
    .forEach(i -> output[i] = translateType(Character.getType(s.codePointAt(i))));