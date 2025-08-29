project.rows.subList(startingRowCount, endingRowCount).forEach(row -> {
    if (archiveColumnIndex >= 0) {
        row.setCell(archiveColumnIndex, new Cell(archiveFileName, null));
    }
    if (filenameColumnIndex >= 0) {
        row.setCell(filenameColumnIndex, new Cell(fileSource, null));
    }
});