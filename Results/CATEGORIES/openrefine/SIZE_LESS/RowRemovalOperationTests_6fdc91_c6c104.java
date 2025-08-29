for (int i = 0; i < 5; i++) {
    Row row = new Row(5);
    row.setCell(0, new Cell(i < 4 ? "a" : "b", null));
    projectIssue567.rows.add(row);
}