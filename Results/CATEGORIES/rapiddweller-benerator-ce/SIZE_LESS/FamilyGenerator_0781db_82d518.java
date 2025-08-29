for (int i = 0; i < biologicalChildrenNumber; i++) {
    FamilyPerson tempChild = this.familyPersonGen.generateFromEntityAndRelation(personForGenerateChildren, lowerRelationConstraints);
    tempChild.addRelationStatusWithPerson(firstFamilyPerson, RelationStatus.CARETAKER);
    tempChild.addRelationStatusWithPerson(firstFamilyPerson, RelationStatus.CARETAKER);
    result.add(tempChild);
}