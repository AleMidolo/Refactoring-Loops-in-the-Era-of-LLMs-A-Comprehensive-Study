for (int i = 0; i < 2; i++) {
    Row row = new Row(2);
    for (int j = 0; j < 2; j++) {
        if (i == 1 && j == 0) {
            row.cells.add(new Cell(null, null));
        } else {
            row.cells.add(new Cell("row" + i + "cell" + j, null));
        }
    }
    project.rows.add(row);
}