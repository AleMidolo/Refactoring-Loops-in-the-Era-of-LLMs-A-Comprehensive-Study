for (Statement statement : update.getAddedStatements()) {
    PropertyIdValue pid = statement.getClaim().getMainSnak().getPropertyId();
    Map<PropertyIdValue, List<Value>> qualifiersMap = new HashMap<>();
    List<SnakGroup> qualifiersList = statement.getClaim().getQualifiers();
    for (SnakGroup qualifier : qualifiersList) {
        PropertyIdValue qualifierPid = qualifier.getProperty();
        List<Value> itemList;
        for (Snak snak : qualifier.getSnaks()) {
            if (!(snak instanceof ValueSnak)) {
                continue;
            }
            if (qualifiersMap.containsKey(qualifierPid)) {
                itemList = qualifiersMap.get(qualifierPid);
            } else {
                itemList = new ArrayList<>();
            }
            itemList.add(((ValueSnak) snak).getValue());
            qualifiersMap.put(qualifierPid, itemList);
        }
    }
    List<Statement> constraintDefinitions = _fetcher.getConstraintsByType(pid, oneOfQualifierValuePropertyQid);
    for (Statement constraintStatement : constraintDefinitions) {
        UseAsQualifierConstraint constraint = new UseAsQualifierConstraint(constraintStatement);
        if (qualifiersMap.containsKey(constraint.allowedQualifierPid)) {
            for (Value value : qualifiersMap.get(constraint.allowedQualifierPid)) {
                if (!constraint.itemList.contains(value)) {
                    QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
                    issue.setProperty("statement_entity", pid);
                    issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
                    issue.setProperty("example_entity", update.getEntityId());
                    addIssue(issue);
                }
            }
        }
    }
}