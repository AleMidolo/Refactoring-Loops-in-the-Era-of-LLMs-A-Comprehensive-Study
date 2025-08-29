for (Snak snak : snakGroup2.getSnaks()) {
    if (!finalSnaks.stream().anyMatch(finalSnak -> snakEquality(finalSnak, snak))) {
        finalSnaks.add(snak);
    }
}