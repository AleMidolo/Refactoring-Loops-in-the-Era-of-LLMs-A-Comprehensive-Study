list.stream()
    .map(element -> copyOrSelf(element))
    .forEach(result::add);