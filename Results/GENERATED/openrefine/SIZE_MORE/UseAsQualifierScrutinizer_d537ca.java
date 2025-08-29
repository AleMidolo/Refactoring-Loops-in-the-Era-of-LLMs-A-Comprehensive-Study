update.getAddedStatements().stream()
        .map(Statement::getClaim)
        .map(Claim::getMainSnak)
        .map(Snak::getPropertyId)
        .forEach(pid -> {
            Map<PropertyIdValue, List<Value>> qualifiersMap = new HashMap<>();
            List<SnakGroup> qualifiersList = _fetcher.getQualifiers(pid);
            qualifiersList.stream()
                .peek(qualifier -> {
                    PropertyIdValue qualifierPid = qualifier.getProperty();
                    qualifier.getSnaks().stream()
                        .filter(s -> s instanceof ValueSnak)
                        .map(s -> (ValueSnak) s)
                        .forEach(valueSnak -> {
                            List<Value> itemList = qualifiersMap.getOrDefault(qualifierPid, new ArrayList<>());
                            itemList.add(valueSnak.getValue());
                            qualifiersMap.put(qualifierPid, itemList);
                        });
                })
                .count();

            List<Statement> constraintDefinitions = _fetcher.getConstraintsByType(pid, oneOfQualifierValuePropertyQid);
            constraintDefinitions.stream()
                .map(UseAsQualifierConstraint::new)
                .filter(constraint -> qualifiersMap.containsKey(constraint.allowedQualifierPid))
                .forEach(constraint -> {
                    List<Value> itemList = qualifiersMap.get(constraint.allowedQualifierPid);
                    itemList.stream()
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