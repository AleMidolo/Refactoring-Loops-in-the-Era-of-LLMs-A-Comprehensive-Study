((List<?>) component.getValue()).stream()
        .filter(item -> item instanceof EdiTemplateRecord)
        .map(item -> (EdiTemplateRecord) item)
        .mapToInt(EdiTemplateRecord::calculateRecursiveSegmentCount)
        .sum();