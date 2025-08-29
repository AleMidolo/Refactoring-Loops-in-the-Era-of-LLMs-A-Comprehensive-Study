for (Separator separator : separators) {
    separator.averagePerLine = separator.totalCount / (double) lineCount;
    separator.stddev = Math.sqrt((((double) lineCount * separator.totalOfSquaredCount) - (separator.totalCount * separator.totalCount)) / ((double) lineCount * (lineCount - 1)));
}