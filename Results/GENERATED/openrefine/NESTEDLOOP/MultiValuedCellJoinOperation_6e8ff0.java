project.rows.stream()
    .filter(oldRow -> oldRow.isCellBlank(keyCellIndex))
    .map(Row::dup)
    .forEach(newRows::add);

IntStream.range(0, oldRowCount)
    .filter(r -> !project.rows.get(r).isCellBlank(keyCellIndex))
    .forEach(r -> {
        int r2 = r + 1;
        while (r2 < oldRowCount && project.rows.get(r2).isCellBlank(keyCellIndex)) {
            r2++;
        }
        if (r2 == r + 1) {
            newRows.add(project.rows.get(r).dup());
        } else {
            StringBuilder sb = new StringBuilder();
            IntStream.range(r, r2)
                .mapToObj(r3 -> project.rows.get(r3).getCellValue(cellIndex))
                .filter(value -> ExpressionUtils.isNonBlankData(value))
                .forEach(value -> {
                    if (sb.length() > 0) {
                        sb.append(_separator);
                    }
                    sb.append(value.toString());
                });
            IntStream.range(r, r2)
                .mapToObj(r3 -> {
                    Row newRow = project.rows.get(r3).dup();
                    if (r3 == r) {
                        newRow.setCell(cellIndex, new Cell(sb.toString(), null));
                    } else {
                        newRow.setCell(cellIndex, null);
                    }
                    return newRow;
                })
                .filter(newRow -> !newRow.isEmpty())
                .forEach(newRows::add);
        }
    });