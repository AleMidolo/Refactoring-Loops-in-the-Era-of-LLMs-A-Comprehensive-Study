for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line != null) {
        oldColumns.add(Column.load(line));
    }
}