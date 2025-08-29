IntStream.range(0, length)
    .mapToObj(i -> rowIndices.get(i))
    .filter(rowIndex -> rowIndex >= 0 && rowIndex < project.rows.size())
    .map(rowIndex -> project.rows.get(rowIndex))
    .map(row -> row.getCell(cellIndex))
    .forEach(cell -> {
        if (cell != null && cell.recon != null && cell.recon.match != null) {
            topicNames.add(cell.recon.match.name);
            topicIds.add(cell.recon.match.id);
            ids.add(cell.recon.match.id);
        } else {
            topicNames.add(null);
            topicIds.add(null);
            ids.add(null);
        }
    });