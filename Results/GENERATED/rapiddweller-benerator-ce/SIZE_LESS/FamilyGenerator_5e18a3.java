IntStream.range(0, childrenAdoptedNumber)
    .mapToObj(i -> this.familyPersonGen.generateFromEntityAndRelation(personForGenerateChildren, lowerRelationConstraints))
    .peek(tempChild -> tempChild.addRelationStatusWithPerson(firstFamilyPerson, RelationStatus.BENEFIT_PROVIDER))
    .forEach(tempChild -> {
        tempChild.addRelationStatusWithPerson(secondFamilyPerson, RelationStatus.BENEFIT_PROVIDER);
        result.add(tempChild);
    });