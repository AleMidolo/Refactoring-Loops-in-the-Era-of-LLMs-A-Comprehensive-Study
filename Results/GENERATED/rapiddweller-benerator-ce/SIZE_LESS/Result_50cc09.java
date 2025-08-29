columns.forEach(column -> {
    if (index > 0) {
        printWriter.print(separator);
    }
    printWriter.print(column);
    index++;
});