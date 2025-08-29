for (int i = 0; i < project.rows.size(); i++) {
    for (int j = 0; j < _removedColumns.size(); j++) {
        int cellIndex = _removedColumns.get(j).getCellIndex();
        Row row = project.rows.get(i);
        row.setCell(cellIndex, null);
    }
}