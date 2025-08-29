group.getSnaks().stream()
    .filter(snak -> snak instanceof ValueSnak)
    .forEach(snak -> {
        if (group.getProperty().getId().equals(property)) {
            pid = (PropertyIdValue) ((ValueSnak) snak).getValue();
        }
        if (group.getProperty().getId().equals(itemOfPropertyConstraintPid)) {
            this.itemList.add(((ValueSnak) snak).getValue());
        }
    });