project.rows.stream()
    .map(row -> row.getCellValue(cellIndex))
    .filter(value -> ExpressionUtils.isNonBlankData(value))
    .map(value -> CharMatcher.whitespace().trimFrom(value.toString()))
    .filter(s -> !sampleSet.contains(s))
    .forEach(s -> {
        samples.add(s);
        sampleSet.add(s);
        if (samples.size() >= sampleSize) {
            return;
        }
    });