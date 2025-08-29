for (Map.Entry<String, ?> component : components.entrySet()) {
    if (component.getValue() instanceof List) {
        for (Object listItem : (List<?>) component.getValue()) {
            if (listItem instanceof EdiTemplateRecord) {
                sum += ((EdiTemplateRecord) listItem).calculateRecursiveSegmentCount();
            }
        }
    }
}