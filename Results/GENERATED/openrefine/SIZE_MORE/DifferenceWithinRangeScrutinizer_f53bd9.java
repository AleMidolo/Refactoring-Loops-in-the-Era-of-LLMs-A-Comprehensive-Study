propertyIdValueValueMap.keySet().stream()
    .map(propertyId -> _fetcher.getConstraintsByType(propertyId, differenceWithinRangeConstraintQid))
    .filter(statementList -> !statementList.isEmpty())
    .map(statementList -> new DifferenceWithinRangeConstraint(statementList.get(0)))
    .forEach(constraint -> {
        PropertyIdValue lowerPropertyId = constraint.lowerPropertyIdValue;
        QuantityValue minRangeValue = constraint.minRangeValue;
        QuantityValue maxRangeValue = constraint.maxRangeValue;
        if (propertyIdValueValueMap.containsKey(lowerPropertyId)) {
            Value startingValue = propertyIdValueValueMap.get(lowerPropertyId);
            Value endingValue = propertyIdValueValueMap.get(propertyId);
            if (startingValue instanceof TimeValue && endingValue instanceof TimeValue) {
                TimeValue lowerDate = (TimeValue) startingValue;
                TimeValue upperDate = (TimeValue) endingValue;
                long differenceInYears = upperDate.getYear() - lowerDate.getYear();
                long differenceInMonths = upperDate.getMonth() - lowerDate.getMonth();
                long differenceInDays = upperDate.getDay() - lowerDate.getDay();
                if (minRangeValue != null && (differenceInYears < minRangeValue.getNumericValue().longValue() || (differenceInYears == 0 && differenceInMonths < 0) || (differenceInYears == 0 && differenceInMonths == 0 && differenceInDays < 0))) {
                    QAWarning issue = new QAWarning(type, propertyId.getId(), QAWarning.Severity.WARNING, 1);
                    issue.setProperty("source_entity", lowerPropertyId);
                    issue.setProperty("target_entity", propertyId);
                    issue.setProperty("min_value", minRangeValue.getNumericValue());
                    if (maxRangeValue != null) {
                        issue.setProperty("max_value", maxRangeValue.getNumericValue());
                    } else {
                        issue.setProperty("max_value", null);
                    }
                    issue.setProperty("example_entity", update.getEntityId());
                    addIssue(issue);
                }
                if (maxRangeValue != null && differenceInYears > maxRangeValue.getNumericValue().longValue()) {
                    QAWarning issue = new QAWarning(type, propertyId.getId(), QAWarning.Severity.WARNING, 1);
                    issue.setProperty("source_entity", lowerPropertyId);
                    issue.setProperty("target_entity", propertyId);
                    if (minRangeValue != null) {
                        issue.setProperty("min_value", minRangeValue.getNumericValue());
                    } else {
                        issue.setProperty("min_value", null);
                    }
                    issue.setProperty("max_value", maxRangeValue.getNumericValue());
                    issue.setProperty("example_entity", update.getEntityId());
                    addIssue(issue);
                }
            }
        }
    });