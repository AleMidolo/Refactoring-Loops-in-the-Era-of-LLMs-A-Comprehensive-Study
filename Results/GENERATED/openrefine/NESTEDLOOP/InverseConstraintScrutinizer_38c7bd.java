_inverse.entrySet().stream()
    .forEach(propertyPair -> {
        PropertyIdValue ourProperty = propertyPair.getKey();
        _statements.get(ourProperty).entrySet().stream()
            .forEach(itemLinks -> {
                itemLinks.getValue().stream()
                    .forEach(idValue -> {
                        PropertyIdValue missingProperty = propertyPair.getValue();
                        Set<EntityIdValue> reciprocalLinks = _statements.get(missingProperty).get(idValue);
                        if (reciprocalLinks == null || !reciprocalLinks.contains(itemLinks.getKey())) {
                            QAWarning issue = new QAWarning(type, ourProperty.getId(), QAWarning.Severity.IMPORTANT, 1);
                            issue.setProperty("added_property_entity", ourProperty);
                            issue.setProperty("inverse_property_entity", missingProperty);
                            issue.setProperty("source_entity", itemLinks.getKey());
                            issue.setProperty("target_entity", idValue);
                            issue.setFacetable(false);
                            addIssue(issue);
                        }
                    });
            });
    });