project.rows.stream()
    .map(row -> row.getCellValue(cellIndex))
    .filter(value -> ExpressionUtils.isNonBlankData(value))
    .map(value -> CharMatcher.whitespace().trimFrom(value.toString()))
    .filter(s -> !sampleSet.contains(s))
    .limit(sampleSize - samples.size())
    .peek(sample -> {
        samples.add(sample);
        sampleSet.add(sample);
    })
    .collect(Collectors.toList());