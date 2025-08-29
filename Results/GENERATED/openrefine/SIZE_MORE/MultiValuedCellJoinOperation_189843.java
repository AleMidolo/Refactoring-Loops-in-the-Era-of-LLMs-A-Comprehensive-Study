project.rows.subList(r, r2).stream()
    .map(row -> {
        Row newRow = row.dup();
        if (row.equals(project.rows.get(r))) {
            newRow.setCell(cellIndex, new Cell(sb.toString(), null));
        } else {
            newRow.setCell(cellIndex, null);
        }
        return newRow;
    })
    .filter(row -> !row.isEmpty())
    .forEach(newRows::add);