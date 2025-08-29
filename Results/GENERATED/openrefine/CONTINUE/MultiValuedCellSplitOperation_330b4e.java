project.rows.stream()
    .filter(oldRow -> oldRow.isCellBlank(cellIndex))
    .map(Row::dup)
    .forEach(newRows::add);

project.rows.stream()
    .filter(oldRow -> !oldRow.isCellBlank(cellIndex))
    .forEach(oldRow -> {
        Object value = oldRow.getCellValue(cellIndex);
        String s = value instanceof String ? ((String) value) : value.toString();
        String[] values;
        
        if ("lengths".equals(_mode)) {
            if (_fieldLengths.length > 0 && _fieldLengths[0] > 0) {
                values = new String[_fieldLengths.length];
                int from = 0;
                int end = s.length();
                for (int i = 0; i < _fieldLengths.length; i++) {
                    int to = Math.min(end, from + _fieldLengths[i]);
                    values[i] = s.substring(from, to);
                    from = to;
                }
            } else {
                values = new String[] { s };
            }
        } else if (_regex) {
            values = _pattern.split(s);
        } else {
            values = StringUtils.splitByWholeSeparatorPreserveAllTokens(s, _separator);
        }
        
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
                int r2 = project.rows.indexOf(oldRow) + v;
                
                if (r2 < project.rows.size()) {
                    Row oldRow2 = project.rows.get(r2);
                    if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                        Row newRow = oldRow2.dup();
                        newRow.setCell(cellIndex, newCell);
                        newRows.add(newRow);
                        return;
                    }
                }
                
                Row newRow = new Row(cellIndex + 1);
                newRow.setCell(cellIndex, newCell);
                newRows.add(newRow);
            });
    });