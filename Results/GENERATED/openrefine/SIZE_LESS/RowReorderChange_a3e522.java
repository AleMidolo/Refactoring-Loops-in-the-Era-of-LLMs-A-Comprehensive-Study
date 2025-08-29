_rowIndices.stream()
    .limit(count)
    .forEach(newIndex -> {
        int oldIndex = _rowIndices.get(newIndex);
        Row row = newRows.get(newIndex);
        oldRows.set(oldIndex, row);
    });