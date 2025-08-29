for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line != null) {
        Row row = Row.load(line, pool);
        project.rows.add(row);
        maxCellCount = Math.max(maxCellCount, row.cells.size());
    }
}