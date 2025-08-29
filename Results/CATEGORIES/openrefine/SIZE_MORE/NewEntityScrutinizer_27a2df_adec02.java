for (MonolingualTextValue label : newItem.getLabels().values()) {
    MonolingualTextValue matchingDescription = descriptions.get(label.getLanguageCode());
    if (matchingDescription != null) {
        LabelDescription labelDescription = new LabelDescription(label.getLanguageCode(), label.getText(), matchingDescription.getText());
        EntityIdValue exampleId = labelDescriptionPairs.get(labelDescription);
        if (exampleId != null) {
            QAWarning issue = new QAWarning(duplicateLabelDescriptionType, label.getLanguageCode(), QAWarning.Severity.CRITICAL, 1);
            issue.setProperty("first_example_entity", exampleId);
            issue.setProperty("second_example_entity", update.getEntityId());
            issue.setProperty("common_label", label.getText());
            issue.setProperty("common_description", matchingDescription.getText());
            issue.setProperty("lang_code", label.getLanguageCode());
            addIssue(issue);
        } else {
            labelDescriptionPairs.put(labelDescription, update.getEntityId());
        }
    }
}