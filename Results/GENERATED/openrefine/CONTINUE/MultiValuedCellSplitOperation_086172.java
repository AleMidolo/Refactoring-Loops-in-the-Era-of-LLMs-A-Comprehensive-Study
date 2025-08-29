IntStream.range(1, values.length)
        .forEach(v -> {
            Cell newCell = new Cell(values[v], null);
            if (r2 < project.rows.size()) {
                Row oldRow2 = project.rows.get(r2);
                if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
                    Row newRow = oldRow2.dup();
                    newRow.setCell(cellIndex, newCell);
                    newRows.add(newRow);
                    r2++;
                    return;
                }
            }
            Row newRow = new Row(cellIndex + 1);
            newRow.setCell(cellIndex, newCell);
            newRows.add(newRow);
        });