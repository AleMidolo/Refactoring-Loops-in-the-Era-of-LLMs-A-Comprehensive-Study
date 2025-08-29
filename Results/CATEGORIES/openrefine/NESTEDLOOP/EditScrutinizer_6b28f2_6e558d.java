for (SnakGroup group : groups) {
    if (group.getProperty().getId().equals(pid)) {
        for (Snak snak : group.getSnaks()) if (snak instanceof ValueSnak) {
            results.add(((ValueSnak) snak).getValue());
        }
    }
}