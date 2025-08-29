IntStream.range(0, lastCell)
    .mapToObj(cellIndex -> {
        Cell cell = null;
        org.apache.poi.ss.usermodel.Cell sourceCell = row.getCell(cellIndex);
        if (sourceCell != null) {
            cell = extractCell(sourceCell, forceText);
        }
        return cell;
    })
    .forEach(cells::add);