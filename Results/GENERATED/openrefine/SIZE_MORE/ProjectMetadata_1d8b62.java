tags.stream()
    .filter(Objects::nonNull)
    .map(tag -> CharMatcher.whitespace().trimFrom(tag))
    .filter(trimmedTag -> !trimmedTag.isEmpty())
    .forEach(tmpTags::add);