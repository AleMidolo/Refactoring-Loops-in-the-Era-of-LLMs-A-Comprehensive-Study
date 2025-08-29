_rowIndices.stream()
    .forEach(i -> {
        int r = _rowIndices.get(i);
        Row oldRow = _oldRows.get(i);
        project.rows.set(r, oldRow);
    });