for (int i = 0; i < 2; i++) {
    Row row = new Row(2);
    row.setCell(0, new Cell("test" + (i + 1), null));
    project.rows.add(row);
}