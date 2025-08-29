for (int i = 0; i < noOfRows; i++) {
    Row row = new Row(noOfColumns);
    for (int j = 0; j < noOfColumns; j++) {
        row.cells.add(new Cell("row" + i + "cell" + j, null));
    }
    project.rows.add(row);
}