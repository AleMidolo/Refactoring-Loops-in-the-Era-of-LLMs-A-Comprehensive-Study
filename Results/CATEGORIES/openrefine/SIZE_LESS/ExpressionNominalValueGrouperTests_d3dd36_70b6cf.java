for (int i = 0; i < numberOfRows; i++) {
    Row row = new Row(1);
    row.setCell(0, new Cell(dateTimeValue, null));
    project.rows.add(row);
}