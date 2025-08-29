update.getAddedStatements().stream()
        .map(Statement::getClaim)
        .map(Claim::getMainSnak)
        .map(Snak::getPropertyId)
        .forEach(pid -> {
            Map<PropertyIdValue, List<Value>> qualifiersMap = new HashMap<>();
            statement.getClaim().getQualifiers().forEach(qualifier -> {
                PropertyIdValue qualifierPid = qualifier.getProperty();
                List<Value> itemList = qualifier.getSnaks().stream()
                        .filter(s -> s instanceof ValueSnak)
                        .map(s -> ((ValueSnak) s).getValue())
                        .collect(Collectors.toList());
                qualifiersMap.merge(qualifierPid, itemList, (list1, list2) -> {
                    List<Value> mergedList = new ArrayList<>(list1);
                    mergedList.addAll(list2);
                    return mergedList;
                });
            });
            
            _fetcher.getConstraintsByType(pid, oneOfQualifierValuePropertyQid).stream()
                    .map(UseAsQualifierConstraint::new)
                    .filter(constraint -> qualifiersMap.containsKey(constraint.allowedQualifierPid))
                    .forEach(constraint -> {
                        qualifiersMap.get(constraint.allowedQualifierPid).stream()
                                .filter(value -> !constraint.itemList.contains(value))
                                .forEach(value -> {
                                    QAWarning issue = new QAWarning(type, pid.getId() + constraint.allowedQualifierPid.getId(), QAWarning.Severity.WARNING, 1);
                                    issue.setProperty("statement_entity", pid);
                                    issue.setProperty("qualifier_entity", constraint.allowedQualifierPid);
                                    issue.setProperty("example_entity", update.getEntityId());
                                    addIssue(issue);
                                });
                    });
        });