_oldRows.stream()
        .forEach(oldRow -> {
            if (index >= _rowIndices.size()) {
                return;
            }
            if (index < rowIndex) {
                _newRows.add(oldRow.dup());
                return;
            }
            if (dataExtension == null || dataExtension.data.length == 0) {
                _newRows.add(oldRow);
            } else {
                Row firstNewRow = oldRow.dup();
                extendRow(firstNewRow, dataExtension, 0, reconMap);
                _newRows.add(firstNewRow);
                int r2 = index + 1;
                for (int subR = 1; subR < dataExtension.data.length; subR++) {
                    if (r2 < project.rows.size()) {
                        Row oldRow2 = project.rows.get(r2);
                        if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                            Row newRow = oldRow2.dup();
                            extendRow(newRow, dataExtension, subR, reconMap);
                            _newRows.add(newRow);
                            r2++;
                            continue;
                        }
                    }
                    Row newRow = new Row(cellIndex + _columnNames.size());
                    extendRow(newRow, dataExtension, subR, reconMap);
                    _newRows.add(newRow);
                }
                index = r2 - 1;
            }
            rowIndex = index < _rowIndices.size() ? _rowIndices.get(index) : _oldRows.size();
            dataExtension = index < _rowIndices.size() ? _dataExtensions.get(index) : null;
            index++;
        });