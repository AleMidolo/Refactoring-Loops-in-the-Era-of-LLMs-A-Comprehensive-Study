specs.stream()
            .flatMap(group -> group.getSnaks().stream())
            .filter(snak -> {
                if (snak instanceof ValueSnak) {
                    String propertyId = snak.getGroup().getProperty().getId();
                    return propertyId.equals(conflictsWithPropertyPid) || propertyId.equals(itemOfPropertyConstraintPid);
                }
                return false;
            })
            .forEach(snak -> {
                if (snak.getGroup().getProperty().getId().equals(conflictsWithPropertyPid)) {
                    pid = (PropertyIdValue) ((ValueSnak) snak).getValue();
                }
                if (snak.getGroup().getProperty().getId().equals(itemOfPropertyConstraintPid)) {
                    this.itemList.add(((ValueSnak) snak).getValue());
                }
            });