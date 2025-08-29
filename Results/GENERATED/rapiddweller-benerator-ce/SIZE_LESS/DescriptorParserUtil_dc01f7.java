builder.append(Arrays.stream(tokens, 1, tokens.length)
  .map(StringUtil::capitalize)
  .collect(Collectors.joining()));