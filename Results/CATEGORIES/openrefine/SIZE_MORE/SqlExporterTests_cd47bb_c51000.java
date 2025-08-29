for (int j = 0; j < noOfColumns; j++) {
    if (k < noOfNullFields) {
        row.cells.add(new Cell("", null));
        k++;
    } else {
        row.cells.add(new Cell("row" + i + "cell" + j, null));
    }
}