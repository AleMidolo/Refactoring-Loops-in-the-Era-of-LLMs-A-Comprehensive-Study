for (String column : columns) {
    if (index > 0) {
        printWriter.print(separator);
    }
    printWriter.print(column);
    index++;
}