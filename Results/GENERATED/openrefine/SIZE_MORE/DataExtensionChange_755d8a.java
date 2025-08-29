dataExtension.data.stream().skip(1)
    .forEach(subR -> {
        if (r2 < project.rows.size()) {
            Row oldRow2 = project.rows.get(r2);
            if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                Row newRow = oldRow2.dup();
                extendRow(newRow, dataExtension, subR, reconMap);
                _newRows.add(newRow);
                r2++;
                return;
            }
        }
        Row newRow = new Row(cellIndex + _columnNames.size());
        extendRow(newRow, dataExtension, subR, reconMap);
        _newRows.add(newRow);
    });