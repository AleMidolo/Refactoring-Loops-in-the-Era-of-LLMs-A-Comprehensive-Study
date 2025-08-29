snakGroupList.stream()
    .flatMap(group -> group.getSnaks().stream())
    .filter(snak -> (group.getProperty().getId().equals(CONSTRAINT_STATUS) && snak instanceof ValueSnak) || (group.getProperty().getId().equals(CONSTRAINT_EXCEPTIONS) && snak instanceof ValueSnak))
    .forEach(snak -> {
        if (group.getProperty().getId().equals(CONSTRAINT_STATUS)) {
            constraintStatus = (ItemIdValue) ((ValueSnak) snak).getValue();
        } else if (group.getProperty().getId().equals(CONSTRAINT_EXCEPTIONS)) {
            constraintExceptions.add((EntityIdValue) ((ValueSnak) snak).getValue());
        }
    });