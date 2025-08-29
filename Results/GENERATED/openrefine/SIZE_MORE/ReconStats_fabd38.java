project.rows.stream()
    .map(row -> row.getCell(cellIndex))
    .filter(Objects::nonNull)
    .filter(cell -> ExpressionUtils.isNonBlankData(cell.value))
    .forEach(cell -> {
        nonBlanks++;
        if (cell.recon != null) {
            switch(cell.recon.judgment) {
                case New:
                    newTopics++;
                    break;
                case Matched:
                    matchedTopics++;
                    break;
                case Error:
                    errorTopics++;
                    break;
            }
        }
    });