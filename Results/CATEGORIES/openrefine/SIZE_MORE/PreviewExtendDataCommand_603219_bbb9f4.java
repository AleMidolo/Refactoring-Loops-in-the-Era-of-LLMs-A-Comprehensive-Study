for (int i = 0; i < length; i++) {
    int rowIndex = rowIndices.get(i);
    if (rowIndex >= 0 && rowIndex < project.rows.size()) {
        Row row = project.rows.get(rowIndex);
        Cell cell = row.getCell(cellIndex);
        if (cell != null && cell.recon != null && cell.recon.match != null) {
            topicNames.add(cell.recon.match.name);
            topicIds.add(cell.recon.match.id);
            ids.add(cell.recon.match.id);
        } else {
            topicNames.add(null);
            topicIds.add(null);
            ids.add(null);
        }
    }
}