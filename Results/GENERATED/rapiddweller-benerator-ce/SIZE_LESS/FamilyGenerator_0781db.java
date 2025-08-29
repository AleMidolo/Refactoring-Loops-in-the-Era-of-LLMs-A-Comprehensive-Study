IntStream.range(0, biologicalChildrenNumber)
    .mapToObj(i -> this.familyPersonGen.generateFromEntityAndRelation(personForGenerateChildren, lowerRelationConstraints))
    .peek(tempChild -> {
        tempChild.addRelationStatusWithPerson(firstFamilyPerson, RelationStatus.CARETAKER);
        tempChild.addRelationStatusWithPerson(firstFamilyPerson, RelationStatus.CARETAKER);
    })
    .forEach(result::add);