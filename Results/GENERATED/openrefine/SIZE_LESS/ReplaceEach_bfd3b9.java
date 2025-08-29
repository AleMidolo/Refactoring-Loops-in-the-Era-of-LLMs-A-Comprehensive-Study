Arrays.stream(searchArgs)
    .map(originalSearchArgs, StringUtils::toString)
    .toArray();