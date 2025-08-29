separators.stream()
    .forEach(separator -> {
        separator.totalCount += separator.currentLineCount;
        separator.totalOfSquaredCount += separator.currentLineCount * separator.currentLineCount;
        separator.currentLineCount = 0;
    });