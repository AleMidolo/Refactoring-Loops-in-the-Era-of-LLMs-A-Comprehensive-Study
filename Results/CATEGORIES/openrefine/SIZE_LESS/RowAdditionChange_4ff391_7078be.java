for (int i = 0; i < count; i++) {
    if ((line = reader.readLine()) != null) {
        rows.add(Row.load(line, pool));
    }
}