project.rows.stream()
    .limit(oldRowCount)
    .forEach(oldRow -> {
        if (oldRow.isCellBlank(cellIndex)) {
            newRows.add(oldRow.dup());
            return;
        }
        Object value = oldRow.getCellValue(cellIndex);
        String s = value instanceof String ? ((String) value) : value.toString();
        String[] values = "lengths".equals(_mode) && _fieldLengths.length > 0 && _fieldLengths[0] > 0 
            ? IntStream.range(0, _fieldLengths.length)
                .mapToObj(i -> {
                    int to = Math.min(s.length(), i > 0 ? _fieldLengths[i - 1] : 0 + _fieldLengths[i]);
                    return s.substring(i > 0 ? _fieldLengths[i - 1] : 0, to);
                })
                .toArray(String[]::new)
            : _regex 
                ? _pattern.split(s) 
                : StringUtils.splitByWholeSeparatorPreserveAllTokens(s, _separator);

        if (values.length < 2) {
            newRows.add(oldRow.dup());
            return;
        }

        Row firstNewRow = oldRow.dup();
        firstNewRow.setCell(cellIndex, new Cell(values[0], null));
        newRows.add(firstNewRow);

        IntStream.range(1, values.length)
            .forEach(v -> {
                Cell newCell = new Cell(values[v], null);
                if (oldRowCount - 1 > v) {
                    Row oldRow2 = project.rows.get(oldRowCount + v);
                    if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                        Row newRow = oldRow2.dup();
                        newRow.setCell(cellIndex, newCell);
                        newRows.add(newRow);
                    } else {
                        Row newRow = new Row(cellIndex + 1);
                        newRow.setCell(cellIndex, newCell);
                        newRows.add(newRow);
                    }
                }
            });
    });