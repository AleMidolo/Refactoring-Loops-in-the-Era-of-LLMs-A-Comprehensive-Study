update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .map(Snak::getPropertyId)
    .distinct()
    .forEach(pid -> {
        Map<PropertyIdValue, List<Value>> qualifiersMap = new HashMap<>();
        List<SnakGroup> qualifiersList = update.getAddedStatements().stream()
            .map(Statement::getClaim)
            .flatMap(claim -> claim.getQualifiers().stream())
            .filter(qualifier -> qualifier.getProperty().equals(pid))
            .collect(Collectors.toList());
        
        qualifiersList.stream()
            .forEach(qualifier -> {
                PropertyIdValue qualifierPid = qualifier.getProperty();
                List<Value> itemList = qualifier.getSnaks().stream()
                    .filter(snak -> snak instanceof ValueSnak)
                    .map(snak -> ((ValueSnak) snak).getValue())
                    .collect(Collectors.toList());
                
                qualifiersMap.merge(qualifierPid, itemList, (existingList, newList) -> {
                    existingList.addAll(newList);
                    return existingList;
                });
            });
        
        List<Statement> constraintDefinitions = _fetcher.getConstraintsByType(pid, oneOfQualifierValuePropertyQid);
        constraintDefinitions.stream()
            .map(UseAsQualifierConstraint::new)
            .filter(constraint -> qualifiersMap.containsKey(constraint.allowedQualifierPid))
            .forEach(constraint -> qualifiersMap.get(constraint.allowedQualifierPid).stream()
                .filter(value -> !constraint.itemList.contains(value))
                .forEach(value -> {
                    QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
                    issue.setProperty("statement_entity", pid);
                    issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
                    issue.setProperty("example_entity", update.getEntityId());
                    addIssue(issue);
                });
    });