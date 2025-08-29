group.getSnaks().stream()
    .filter(s -> s instanceof ValueSnak)
    .map(s -> ((ValueSnak) s).getValue())
    .forEach(results::add);