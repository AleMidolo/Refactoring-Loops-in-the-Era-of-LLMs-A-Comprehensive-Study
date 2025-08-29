IntStream.range(from, end)
    .mapToObj(i -> rowIndices.get(i))
    .map(index -> _project.rows.get(index))
    .map(row -> row.getCell(_cellIndex))
    .map(cell -> cell.recon.match.id)
    .forEach(guid -> {
        if (map.containsKey(guid)) {
            dataExtensions.add(map.get(guid));
        } else {
            dataExtensions.add(null);
        }
    });