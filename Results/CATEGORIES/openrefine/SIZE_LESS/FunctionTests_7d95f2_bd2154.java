for (int i = 0; i < 10; i++) {
    Row row = new Row(1);
    row.setCell(0, new Cell(i < 5 ? "a" : new Integer(1), null));
    project.rows.add(row);
}