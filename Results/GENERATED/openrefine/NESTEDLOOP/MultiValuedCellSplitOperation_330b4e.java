project.rows.stream()
        .filter(oldRow -> oldRow.isCellBlank(cellIndex))
        .map(Row::dup)
        .forEach(newRows::add);
        
IntStream.range(0, oldRowCount)
        .mapToObj(project.rows::get)
        .forEach(oldRow -> {
            Object value = oldRow.getCellValue(cellIndex);
            String s = value instanceof String ? ((String) value) : value.toString();
            String[] values;
            
            if ("lengths".equals(_mode)) {
                if (_fieldLengths.length > 0 && _fieldLengths[0] > 0) {
                    values = IntStream.range(0, _fieldLengths.length)
                            .mapToObj(i -> {
                                int from = 0;
                                int end = s.length();
                                int to = Math.min(end, from + _fieldLengths[i]);
                                from = to;
                                return s.substring(from, to);
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
                newRows.add(oldRow.dup());
            } else {
                Row firstNewRow = oldRow.dup();
                firstNewRow.setCell(cellIndex, new Cell(values[0], null));
                newRows.add(firstNewRow);
                int[] r2 = {r + 1};
                IntStream.range(1, values.length)
                        .forEach(v -> {
                            Cell newCell = new Cell(values[v], null);
                            if (r2[0] < project.rows.size()) {
                                Row oldRow2 = project.rows.get(r2[0]);
                                if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                                    Row newRow = oldRow2.dup();
                                    newRow.setCell(cellIndex, newCell);
                                    newRows.add(newRow);
                                    r2[0]++;
                                }
                            }
                            Row newRow = new Row(cellIndex + 1);
                            newRow.setCell(cellIndex, newCell);
                            newRows.add(newRow);
                        });
                r = r2[0] - 1;
            }
        });