widths.stream()
        .forEach(width -> {
            if (columnStartCursor >= line.length()) {
                cells.add(null);
                return;
            }
            columnEndCursor = columnStartCursor + width;
            if (columnEndCursor > line.length()) {
                columnEndCursor = line.length();
            }
            if (columnEndCursor <= columnStartCursor) {
                cells.add(null);
                return;
            }
            cells.add(line.substring(columnStartCursor, columnEndCursor));
            columnStartCursor = columnEndCursor;
        });