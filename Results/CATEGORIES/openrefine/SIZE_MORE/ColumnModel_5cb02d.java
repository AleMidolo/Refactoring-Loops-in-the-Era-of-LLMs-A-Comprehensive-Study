for (ColumnGroup g : columnGroups) {
    if (g.startColumnIndex == startColumnIndex && g.columnSpan == span) {
        if (g.keyColumnIndex == keyColumnIndex) {
            return;
        } else {
            columnGroups.remove(g);
            break;
        }
    }
}