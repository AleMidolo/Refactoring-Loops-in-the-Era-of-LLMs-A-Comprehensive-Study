patterns.stream()
        .filter(pattern -> !pattern.matcher(value).matches())
        .forEach(pattern -> {
            if (added) {
                QAWarning issue = new QAWarning(type, pid.getId(), QAWarning.Severity.IMPORTANT, 1);
                issue.setProperty("property_entity", pid);
                issue.setProperty("regex", pattern.toString());
                issue.setProperty("example_value", value);
                issue.setProperty("example_item_entity", entityId);
                addIssue(issue);
            } else {
                info("remove-statements-with-invalid-format");
            }
        });