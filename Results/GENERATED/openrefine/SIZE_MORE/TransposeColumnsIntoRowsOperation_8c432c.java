newColumns.stream()
        .filter(c -> c < startColumnIndex || (_combinedColumnName != null ? c > startColumnIndex : c > startColumnIndex + 1))
        .forEach(c -> {
            Column column = newColumns.get(c);
            int cellIndex = column.getCellIndex();
            Cell cellToCopy = firstNewRow.getCell(cellIndex);
            if (cellToCopy != null && newRow.getCell(cellIndex) == null) {
                newRow.setCell(cellIndex, cellToCopy);
            }
        });