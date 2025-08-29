for (int i = startingRowCount; i < endingRowCount; i++) {
    Row row = project.rows.get(i);
    if (archiveColumnIndex >= 0) {
        row.setCell(archiveColumnIndex, new Cell(archiveFileName, null));
    }
    if (filenameColumnIndex >= 0) {
        row.setCell(filenameColumnIndex, new Cell(fileSource, null));
    }
}