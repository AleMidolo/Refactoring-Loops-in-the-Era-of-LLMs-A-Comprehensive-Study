dataExtension.data.stream()
    .skip(1)
    .filter(subR -> r2 < project.rows.size())
    .forEach(subR -> {
        if (project.rows.get(r2).isCellBlank(cellIndex)
                && project.rows.get(r2).isCellBlank(keyCellIndex)) {
            Row oldRow2 = project.rows.get(r2);
            Row newRow = oldRow2.dup();
            extendRow(newRow, dataExtension, subR, reconMap);
            _newRows.add(newRow);
            r2++;
        } else {
            Row newRow = new Row(cellIndex + _columnNames.size());
            extendRow(newRow, dataExtension, subR, reconMap);
            _newRows.add(newRow);
        }
    });