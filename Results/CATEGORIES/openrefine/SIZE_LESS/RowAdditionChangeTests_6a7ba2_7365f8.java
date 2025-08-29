for (int i = insertionIndex; i < newRows.size(); i++) {
    Row actual = project.rows.get(i);
    Row expected = newRows.get(i);
    assertSame(actual, expected);
}