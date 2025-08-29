for (int i = 0; i < oldColumns.size(); i++) {
    if (i != keyColumnIndex && i != valueColumnIndex && i != noteColumnIndex) {
        unchangedColumns.add(oldColumns.get(i));
    }
}