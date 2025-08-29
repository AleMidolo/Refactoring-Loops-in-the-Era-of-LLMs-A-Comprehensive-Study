for (Row row : project.rows) {
    Cell cell = row.getCell(cellIndex);
    if (cell != null && ExpressionUtils.isNonBlankData(cell.value)) {
        nonBlanks++;
        if (cell.recon != null) {
            if (cell.recon.judgment == Judgment.New) {
                newTopics++;
            } else if (cell.recon.judgment == Judgment.Matched) {
                matchedTopics++;
            } else if (cell.recon.judgment == Judgment.Error) {
                errorTopics++;
            }
        }
    }
}