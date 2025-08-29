int end = from;
List<Integer> ids = new ArrayList<>();

while (end < limit && ids.size() < 10) {
    int index = rowIndices.get(end);
    Row row = _project.rows.get(index);
    Cell cell = row.getCell(_cellIndex);
    ids.add(cell.recon.match.id);

    end++;
}