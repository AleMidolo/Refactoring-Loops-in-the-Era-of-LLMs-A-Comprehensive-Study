group.getSnaks().stream()
    .filter(snak -> group.getProperty().getId().equals(conflictsWithPropertyPid) && snak instanceof ValueSnak)
    .forEach(snak -> pid = (PropertyIdValue) ((ValueSnak) snak).getValue());

group.getSnaks().stream()
    .filter(snak -> group.getProperty().getId().equals(itemOfPropertyConstraintPid) && snak instanceof ValueSnak)
    .forEach(snak -> this.itemList.add(((ValueSnak) snak).getValue());