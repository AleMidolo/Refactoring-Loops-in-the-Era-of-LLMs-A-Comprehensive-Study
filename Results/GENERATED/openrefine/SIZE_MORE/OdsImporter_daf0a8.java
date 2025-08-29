IntStream.rangeClosed(0, lastCell)
    .mapToObj(cellIndex -> {
        Cell cell = null;
        OdfTableCell sourceCell = row.getCellByIndex(cellIndex);
        if (sourceCell != null) {
            cell = extractCell(sourceCell);
        }
        cells.add(cell);
        if (cell != null && cellIndex > maxCol) {
            maxCol = cellIndex;
        }
        return cell;
    })
    .collect(Collectors.toList());