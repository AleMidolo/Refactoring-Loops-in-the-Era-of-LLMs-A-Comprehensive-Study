for (Snak snak : group.getSnaks()) if (snak instanceof ValueSnak) {
    results.add(((ValueSnak) snak).getValue());
}