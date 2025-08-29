specs.stream()
     .forEach(group -> group.getSnaks()
                            .forEach(snak -> {
                                if (group.getProperty().getId().equals(conflictsWithPropertyPid) && snak instanceof ValueSnak) {
                                    pid = (PropertyIdValue) ((ValueSnak) snak).getValue();
                                }
                                if (group.getProperty().getId().equals(itemOfPropertyConstraintPid) && snak instanceof ValueSnak) {
                                    this.itemList.add(((ValueSnak) snak).getValue());
                                }
                            }));