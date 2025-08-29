for (Object listItem : (List<?>) component.getValue()) {
    if (listItem instanceof EdiTemplateRecord) {
        sum += ((EdiTemplateRecord) listItem).calculateRecursiveSegmentCount();
    }
}