for (MonolingualTextValue label : labels) {
    String labelText = label.getText();
    if (labelText == null) {
        continue;
    }
    labelText = labelText.trim();
    if (labelText.equals(descText)) {
        QAWarning issue = new QAWarning(descIdenticalWithLabel, null, QAWarning.Severity.WARNING, 1);
        issue.setProperty("example_entity", update.getEntityId());
        issue.setProperty("description", descText);
        issue.setProperty("lang", lang);
        issue.setProperty("label_lang", label.getLanguageCode());
        addIssue(issue);
        break;
    }
}