for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line != null) {
        rows.add(Row.load(line, pool));
    }
}