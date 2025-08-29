for (int i = insertionIndex; i < newRows.size(); i++) {
    Row actual = project.rows.get(insertionIndex + i);
    Row expected = newRows.get(i);
    assertSame(actual, expected);
}