_rowIndices.stream()
    .forEach(i -> {
        int r = _rowIndices.get(i);
        Row newRow = _newRows.get(i);
        project.rows.set(r, newRow);
    });