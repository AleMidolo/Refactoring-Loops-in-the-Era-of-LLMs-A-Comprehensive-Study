IntStream.range(0, oldRowCount)
    .forEach(r -> {
        Row oldRow = project.rows.get(r);
        if (oldRow.isCellBlank(keyCellIndex)) {
            newRows.add(oldRow.dup());
            return;
        }
        int r2 = r + 1;
        while (r2 < oldRowCount && project.rows.get(r2).isCellBlank(keyCellIndex)) {
            r2++;
        }
        if (r2 == r + 1) {
            newRows.add(oldRow.dup());
            return;
        }
        StringBuffer sb = new StringBuffer();
        IntStream.range(r, r2)
            .forEach(r3 -> {
                Object value = project.rows.get(r3).getCellValue(cellIndex);
                if (ExpressionUtils.isNonBlankData(value)) {
                    if (sb.length() > 0) {
                        sb.append(_separator);
                    }
                    sb.append(value.toString());
                }
            });
        IntStream.range(r, r2)
            .forEach(r3 -> {
                Row newRow = project.rows.get(r3).dup();
                if (r3 == r) {
                    newRow.setCell(cellIndex, new Cell(sb.toString(), null));
                } else {
                    newRow.setCell(cellIndex, null);
                }
                if (!newRow.isEmpty()) {
                    newRows.add(newRow);
                }
            });
        r = r2 - 1;
    });