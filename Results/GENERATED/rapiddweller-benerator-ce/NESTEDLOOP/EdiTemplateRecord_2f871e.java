components.entrySet()
    .stream()
    .filter(entry -> entry.getValue() instanceof List)
    .flatMap(entry -> ((List<?>) entry.getValue()).stream())
    .filter(listItem -> listItem instanceof EdiTemplateRecord)
    .forEach(listItem -> sum += ((EdiTemplateRecord) listItem).calculateRecursiveSegmentCount());