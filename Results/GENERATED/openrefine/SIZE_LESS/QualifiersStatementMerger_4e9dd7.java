snakGroup2.getSnaks().stream()
    .filter(snak -> finalSnaks.stream().noneMatch(finalSnak -> snakEquality(finalSnak, snak)))
    .forEach(finalSnaks::add);