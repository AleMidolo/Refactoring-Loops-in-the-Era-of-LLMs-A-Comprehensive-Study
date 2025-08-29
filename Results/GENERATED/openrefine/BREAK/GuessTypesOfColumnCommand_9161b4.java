project.rows.stream()
    .map(row -> row.getCellValue(cellIndex))
    .filter(value -> ExpressionUtils.isNonBlankData(value))
    .map(value -> CharMatcher.whitespace().trimFrom(value.toString()))
    .filter(s -> !sampleSet.contains(s))
    .limit(sampleSize - samples.size())
    .forEach(s -> {
        samples.add(s);
        sampleSet.add(s);
    });