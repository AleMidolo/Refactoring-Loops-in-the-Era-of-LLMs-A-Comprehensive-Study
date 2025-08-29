for (Separator separator : separators) {
    separator.totalCount += separator.currentLineCount;
    separator.totalOfSquaredCount += separator.currentLineCount * separator.currentLineCount;
    separator.currentLineCount = 0;
}