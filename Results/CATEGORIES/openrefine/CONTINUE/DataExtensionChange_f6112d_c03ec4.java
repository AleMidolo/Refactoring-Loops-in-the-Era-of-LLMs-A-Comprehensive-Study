for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line == null) {
        continue;
    }
    if (line.length() == 0) {
        dataExtensions.add(null);
        continue;
    }
    int rowCount = Integer.parseInt(line);
    for (int r = 0; r < rowCount; r++) {
        for (int c = 0; c < columnNames.size(); c++) {
            line = reader.readLine();
        }
    }
}