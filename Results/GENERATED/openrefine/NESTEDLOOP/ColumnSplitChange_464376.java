_rowIndices.intStream()
    .forEach(i -> {
        int r = _rowIndices.get(i);
        List<Serializable> tuple = _tuples.get(i);
        Row oldRow = project.rows.get(r);
        Row newRow = oldRow.dup();
        _oldRows.add(oldRow);
        _newRows.add(newRow);
        tuple.intStream()
            .forEach(c -> {
                Serializable value = tuple.get(c);
                if (value != null) {
                    newRow.setCell(_firstNewCellIndex + c, new Cell(value, null));
                }
            });
        if (_removeOriginalColumn) {
            newRow.setCell(cellIndex, null);
        }
    });