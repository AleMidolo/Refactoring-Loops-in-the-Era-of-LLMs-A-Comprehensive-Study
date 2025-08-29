for (int i = 0; i < oldColumnGroupCount; i++) {
    String line = reader.readLine();
    if (line != null) {
        oldColumnGroups.add(ColumnGroup.load(line));
    }
}