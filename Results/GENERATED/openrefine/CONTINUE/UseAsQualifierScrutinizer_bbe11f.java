update.getAddedStatements().stream()
    .map(Statement::getClaim)
    .map(Claim::getMainSnak)
    .map(Snak::getPropertyId)
    .distinct()
    .forEach(pid -> {
        Map<PropertyIdValue, List<Value>> qualifiersMap = update.getAddedStatements().stream()
            .filter(statement -> statement.getClaim().getMainSnak().getPropertyId().equals(pid))
            .flatMap(statement -> statement.getClaim().getQualifiers().stream())
            .collect(Collectors.toMap(SnakGroup::getProperty, qualifier -> qualifier.getSnaks().stream()
                .filter(snak -> snak instanceof ValueSnak)
                .map(snak -> ((ValueSnak) snak).getValue())
                .collect(Collectors.toList()), (l1, l2) -> {
                List<Value> list = new ArrayList<>();
                list.addAll(l1);
                list.addAll(l2);
                return list;
        }));

        List<Statement> constraintDefinitions = _fetcher.getConstraintsByType(pid, oneOfQualifierValuePropertyQid);
        constraintDefinitions.stream()
            .map(UseAsQualifierConstraint::new)
            .filter(constraint -> qualifiersMap.containsKey(constraint.allowedQualifierPid))
            .forEach(constraint -> qualifiersMap.get(constraint.allowedQualifierPid)
                .stream()
                .filter(value -> !constraint.itemList.contains(value))
                .forEach(value -> {
                    QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
                    issue.setProperty("statement_entity", pid);
                    issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
                    issue.setProperty("example_entity", update.getEntityId());
                    addIssue(issue);
            });
});