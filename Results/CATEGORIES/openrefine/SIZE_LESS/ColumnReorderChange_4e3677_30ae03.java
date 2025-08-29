for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line != null) {
        removedColumns.add(Column.load(line));
    }
}