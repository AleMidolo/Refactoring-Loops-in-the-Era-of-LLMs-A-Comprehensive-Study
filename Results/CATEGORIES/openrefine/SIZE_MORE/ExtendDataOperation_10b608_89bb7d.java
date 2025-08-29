for (int i = from; i < end; i++) {
    int index = rowIndices.get(i);
    Row row = _project.rows.get(index);
    Cell cell = row.getCell(_cellIndex);
    String guid = cell.recon.match.id;
    if (map.containsKey(guid)) {
        dataExtensions.add(map.get(guid));
    } else {
        dataExtensions.add(null);
    }
}