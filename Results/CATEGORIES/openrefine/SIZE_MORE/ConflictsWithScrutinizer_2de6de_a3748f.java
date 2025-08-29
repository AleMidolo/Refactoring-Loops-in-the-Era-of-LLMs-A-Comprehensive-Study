for (SnakGroup group : specs) {
    for (Snak snak : group.getSnaks()) {
        if (group.getProperty().getId().equals(conflictsWithPropertyPid) && snak instanceof ValueSnak) {
            pid = (PropertyIdValue) ((ValueSnak) snak).getValue();
        }
        if (group.getProperty().getId().equals(itemOfPropertyConstraintPid) && snak instanceof ValueSnak) {
            this.itemList.add(((ValueSnak) snak).getValue());
        }
    }
}