for (int i = changeIndex; i < insertionIndex + changeCount; i++) {
    Row row = project.rows.get(i);
    assertBlankRow(row);
}