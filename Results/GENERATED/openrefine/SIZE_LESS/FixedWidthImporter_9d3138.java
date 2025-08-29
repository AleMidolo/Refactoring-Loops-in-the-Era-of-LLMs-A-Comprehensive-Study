strings.stream()
       .map(s -> CharMatcher.whitespace().trimFrom(s))
       .filter(s -> !s.isEmpty())
       .forEach(retrievedColumnNames::add);