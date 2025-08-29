for (Snak snak : group.getSnaks()) {
    if (!(snak instanceof ValueSnak)) {
        continue;
    }
    if (group.getProperty().getId().equals(property)) {
        pid = (PropertyIdValue) ((ValueSnak) snak).getValue();
    }
    if (group.getProperty().getId().equals(itemOfPropertyConstraintPid)) {
        this.itemList.add(((ValueSnak) snak).getValue());
    }
}