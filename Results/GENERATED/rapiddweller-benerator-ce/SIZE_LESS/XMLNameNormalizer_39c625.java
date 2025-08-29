Arrays.stream(tokens, 1, tokens.length)
    .map(StringUtil::capitalize)
    .forEach(builder::append);