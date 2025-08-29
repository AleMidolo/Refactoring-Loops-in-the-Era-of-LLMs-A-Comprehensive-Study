for (int c = 0; c < counts.length; c++) {
    int count = counts[c];
    if (count == lineCount) {
        widths.add(c - startIndex + 1);
        startIndex = c + 1;
    }
}