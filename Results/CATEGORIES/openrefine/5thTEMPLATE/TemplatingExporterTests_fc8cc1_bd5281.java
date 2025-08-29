for (int j = 0; j < 2; j++) {
    if (i == 1 && j == 0) {
        row.cells.add(new Cell(null, null));
    } else {
        row.cells.add(new Cell("row" + i + "cell" + j, null));
    }
}