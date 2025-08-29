for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line != null) {
        oldRows.add(Row.load(line, pool));
    }
}