widths.stream()
    .filter(width -> columnStartCursor < line.length())
    .map(width -> {
        columnEndCursor = columnStartCursor + width;
        return columnEndCursor > line.length() ? line.length() : columnEndCursor;
    })
    .filter(columnEndCursor -> columnEndCursor > columnStartCursor)
    .map(columnEndCursor -> line.substring(columnStartCursor, columnEndCursor))
    .forEach(cell -> {
        cells.add(cell);
        columnStartCursor = columnEndCursor;});