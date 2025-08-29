group.getSnaks().stream()
    .filter(s -> s instanceof ValueSnak)
    .forEach(s -> {
        if (group.getProperty().getId().equals(property)) {
            pid = (PropertyIdValue) ((ValueSnak) s).getValue();
        }
        if (group.getProperty().getId().equals(itemOfPropertyConstraintPid)) {
            this.itemList.add(((ValueSnak) s).getValue());
        }
    });