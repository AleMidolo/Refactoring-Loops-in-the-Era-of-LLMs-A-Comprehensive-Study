from = IntStream.range(from, limit)
    .filter(i -> ids.size() < 10)
    .mapToObj(end -> {
        int index = rowIndices.get(end);
        Row row = _project.rows.get(index);
        Cell cell = row.getCell(_cellIndex);
        return cell.recon.match.id;
    })
    .forEach(ids::add);