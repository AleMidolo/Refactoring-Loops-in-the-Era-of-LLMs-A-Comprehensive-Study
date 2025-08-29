for (int r = 1; r < rowCount; r++) {
    RowDependency rd = _rowDependencies.get(r);
    if (rd.recordIndex >= 0) {
        _records.add(new Record(recordRowIndex, r, recordIndex++));
        recordIndex = rd.recordIndex;
        recordRowIndex = r;
    }
}