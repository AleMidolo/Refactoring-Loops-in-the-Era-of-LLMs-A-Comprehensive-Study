for (int i = insertionIndex; i < newRows.size(); i++) {
    Row row = project.rows.get(i);
    assertBlankRow(row);
}