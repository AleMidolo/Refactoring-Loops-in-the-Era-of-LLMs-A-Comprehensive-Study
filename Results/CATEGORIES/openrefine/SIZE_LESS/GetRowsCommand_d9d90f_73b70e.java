for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    Row row = project.rows.get(r);
    results.add(new WrappedRow(row, r, r == record.fromRowIndex ? record.recordIndex : null, sortedStartRowIndex + r - record.fromRowIndex));
}