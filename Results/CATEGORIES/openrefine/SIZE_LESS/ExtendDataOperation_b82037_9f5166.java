for (end = from; end < limit && ids.size() < 10; end++) {
    int index = rowIndices.get(end);
    Row row = _project.rows.get(index);
    Cell cell = row.getCell(_cellIndex);
    ids.add(cell.recon.match.id);
}