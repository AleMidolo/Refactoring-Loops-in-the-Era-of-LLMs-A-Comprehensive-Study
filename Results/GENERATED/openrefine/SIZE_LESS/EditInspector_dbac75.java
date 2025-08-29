mergedUpdates.stream()
    .filter(update -> !update.isNull())
    .forEach(update -> scrutinizers.values().forEach(scrutinizer -> scrutinizer.scrutinize(update)));