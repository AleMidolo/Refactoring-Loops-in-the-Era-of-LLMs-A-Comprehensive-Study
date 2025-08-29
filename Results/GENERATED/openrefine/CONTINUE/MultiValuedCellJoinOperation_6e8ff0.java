project.rows.stream()
    .limit(oldRowCount)
    .forEach(oldRow -> {
        if (oldRow.isCellBlank(keyCellIndex)) {
            newRows.add(oldRow.dup());
            return;
        }
        int r2 = project.rows.indexOf(oldRow) + 1;
        while (r2 < oldRowCount && project.rows.get(r2).isCellBlank(keyCellIndex)) {
            r2++;
        }
        if (r2 == project.rows.indexOf(oldRow) + 1) {
            newRows.add(oldRow.dup());
            return;
        }
        StringBuilder sb = new StringBuilder();
        IntStream.range(project.rows.indexOf(oldRow), r2)
            .mapToObj(r3 -> project.rows.get(r3).getCellValue(cellIndex))
            .filter(value -> ExpressionUtils.isNonBlankData(value))
            .forEach(value -> {
                if (sb.length() > 0) {
                    sb.append(_separator);
                }
                sb.append(value.toString());
            });
        IntStream.range(project.rows.indexOf(oldRow), r2)
            .mapToObj(r3 -> {
                Row newRow = project.rows.get(r3).dup();
                if (r3 == project.rows.indexOf(oldRow)) {
                    newRow.setCell(cellIndex, new Cell(sb.toString(), null));
                } else {
                    newRow.setCell(cellIndex, null);
                }
                return newRow;
            })
            .filter(newRow -> !newRow.isEmpty())
            .forEach(newRows::add);
        project.rows.get(r2 - 1);
    });