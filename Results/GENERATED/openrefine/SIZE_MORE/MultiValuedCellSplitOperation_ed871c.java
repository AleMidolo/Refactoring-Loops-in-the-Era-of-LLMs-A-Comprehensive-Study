project.rows.stream()
    .limit(oldRowCount)
    .map(r -> {
        Row oldRow = project.rows.get(r);
        if (oldRow.isCellBlank(cellIndex)) {
            return oldRow.dup();
        }
        Object value = oldRow.getCellValue(cellIndex);
        String s = value instanceof String ? ((String) value) : value.toString();
        String[] values;
        if ("lengths".equals(_mode)) {
            if (_fieldLengths.length > 0 && _fieldLengths[0] > 0) {
                values = new String[_fieldLengths.length];
                int from = 0;
                int end = s.length();
                return IntStream.range(0, _fieldLengths.length)
                    .mapToObj(i -> {
                        int to = Math.min(end, from + _fieldLengths[i]);
                        String subValue = s.substring(from, to);
                        from = to;
                        return subValue;
                    })
                    .toArray(String[]::new);
            } else {
                values = new String[] { s };
            }
        } else if (_regex) {
            values = _pattern.split(s);
        } else {
            values = StringUtils.splitByWholeSeparatorPreserveAllTokens(s, _separator);
        }
        if (values.length < 2) {
            return oldRow.dup();
        }
        Row firstNewRow = oldRow.dup();
        firstNewRow.setCell(cellIndex, new Cell(values[0], null));
        List<Row> newRowList = new ArrayList<>();
        newRowList.add(firstNewRow);
        int r2 = r + 1;
        for (int v = 1; v < values.length; v++) {
            Cell newCell = new Cell(values[v], null);
            if (r2 < project.rows.size()) {
                Row oldRow2 = project.rows.get(r2);
                if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                    Row newRow = oldRow2.dup();
                    newRow.setCell(cellIndex, newCell);
                    newRowList.add(newRow);
                    r2++;
                    continue;
                }
            }
            Row newRow = new Row(cellIndex + 1);
            newRow.setCell(cellIndex, newCell);
            newRowList.add(newRow);
        }
        r = r2 - 1;
        return newRowList;
    })
    .flatMap(List::stream)
    .collect(Collectors.toList());