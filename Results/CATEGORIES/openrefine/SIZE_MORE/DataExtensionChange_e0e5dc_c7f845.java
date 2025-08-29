for (int i = 0; i < count; i++) {
    line = reader.readLine();
    if (line == null || line.length() == 0) {
        columnTypes.add(null);
    } else {
        columnTypes.add(ReconType.load(line));
    }
}