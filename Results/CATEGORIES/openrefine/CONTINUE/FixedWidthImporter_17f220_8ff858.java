for (int width : widths) {
    if (columnStartCursor >= line.length()) {
        cells.add(null);
        continue;
    }
    columnEndCursor = columnStartCursor + width;
    if (columnEndCursor > line.length()) {
        columnEndCursor = line.length();
    }
    if (columnEndCursor <= columnStartCursor) {
        cells.add(null);
        continue;
    }
    cells.add(line.substring(columnStartCursor, columnEndCursor));
    columnStartCursor = columnEndCursor;
}