IntStream.range(from, end)
    .mapToObj(rowIndices::get)
    .map(_project.rows::get)
    .map(row -> row.getCell(_cellIndex))
    .map(cell -> cell.recon.match.id)
    .map(guid -> map.containsKey(guid) ? map.get(guid) : null)
    .forEach(dataExtensions::add);