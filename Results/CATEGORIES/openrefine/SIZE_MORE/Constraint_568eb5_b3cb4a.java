for (Snak snak : group.getSnaks()) {
    if (group.getProperty().getId().equals(CONSTRAINT_STATUS) && snak instanceof ValueSnak) {
        constraintStatus = (ItemIdValue) ((ValueSnak) snak).getValue();
    } else if (group.getProperty().getId().equals(CONSTRAINT_EXCEPTIONS) && snak instanceof ValueSnak) {
        constraintExceptions.add((EntityIdValue) ((ValueSnak) snak).getValue());
    }
}