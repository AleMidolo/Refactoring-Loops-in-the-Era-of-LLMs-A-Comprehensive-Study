snakGroupList.stream()
    .forEach(group -> group.getSnaks().stream()
        .filter(snak -> (group.getProperty().getId().equals(CONSTRAINT_STATUS) && snak instanceof ValueSnak))
        .forEach(snak -> constraintStatus = (ItemIdValue) ((ValueSnak) snak).getValue());

        group.getSnaks().stream()
        .filter(snak -> (group.getProperty().getId().equals(CONSTRAINT_EXCEPTIONS) && snak instanceof ValueSnak))
        .forEach(snak -> constraintExceptions.add((EntityIdValue) ((ValueSnak) snak).getValue()));
    });