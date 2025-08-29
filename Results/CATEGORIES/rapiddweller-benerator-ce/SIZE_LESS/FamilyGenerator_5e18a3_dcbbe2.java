for (int i = 0; i < childrenAdoptedNumber; i++) {
    FamilyPerson tempChild = this.familyPersonGen.generateFromEntityAndRelation(personForGenerateChildren, lowerRelationConstraints);
    tempChild.addRelationStatusWithPerson(firstFamilyPerson, RelationStatus.BENEFIT_PROVIDER);
    tempChild.addRelationStatusWithPerson(secondFamilyPerson, RelationStatus.BENEFIT_PROVIDER);
    result.add(tempChild);
}