for (Row row : project.rows) {
    Object value = row.getCellValue(cellIndex);
    if (ExpressionUtils.isNonBlankData(value)) {
        String s = CharMatcher.whitespace().trimFrom(value.toString());
        if (!sampleSet.contains(s)) {
            samples.add(s);
            sampleSet.add(s);
            if (samples.size() >= sampleSize) {
                break;
            }
        }
    }
}