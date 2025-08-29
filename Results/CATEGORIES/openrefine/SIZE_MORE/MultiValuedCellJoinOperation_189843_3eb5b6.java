for (int r3 = r; r3 < r2; r3++) {
    Row newRow = project.rows.get(r3).dup();
    if (r3 == r) {
        newRow.setCell(cellIndex, new Cell(sb.toString(), null));
    } else {
        newRow.setCell(cellIndex, null);
    }
    if (!newRow.isEmpty()) {
        newRows.add(newRow);
    }
}