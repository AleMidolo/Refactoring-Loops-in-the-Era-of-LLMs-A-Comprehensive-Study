labels.stream()
    .map(MonolingualTextValue::getText)
    .filter(Objects::nonNull)
    .map(String::trim)
    .filter(labelText -> labelText.equals(descText))
    .findFirst()
    .ifPresent(labelText -> {
        QAWarning issue = new QAWarning(descIdenticalWithLabel, null, QAWarning.Severity.WARNING, 1);
        issue.setProperty("example_entity", update.getEntityId());
        issue.setProperty("description", descText);
        issue.setProperty("lang", lang);
        issue.setProperty("label_lang", label.getLanguageCode());
        addIssue(issue);
    });