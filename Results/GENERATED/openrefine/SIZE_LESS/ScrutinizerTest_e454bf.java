Arrays.asList(updates).stream()
    .filter(update -> !update.isNull())
    .forEach(scrutinizer::scrutinize);