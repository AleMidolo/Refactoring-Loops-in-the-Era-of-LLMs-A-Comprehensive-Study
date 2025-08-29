for (List<Cell> row : record.rows) {
    if (row.size() > 0) {
        Row realRow = new Row(row.size());
        for (int c = 0; c < row.size(); c++) {
            Cell cell = row.get(c);
            if (cell != null) {
                realRow.setCell(c, cell);
            }
        }
        project.rows.add(realRow);
    }
}