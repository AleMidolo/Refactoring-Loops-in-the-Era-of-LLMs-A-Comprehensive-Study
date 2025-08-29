components.entrySet().stream()
    .filter(entry -> entry.getValue() instanceof List)
    .flatMap(entry -> ((List<?>) entry.getValue()).stream())
    .filter(item -> item instanceof EdiTemplateRecord)
    .map(item -> (EdiTemplateRecord) item)
    .forEach(record -> sum += record.calculateRecursiveSegmentCount());