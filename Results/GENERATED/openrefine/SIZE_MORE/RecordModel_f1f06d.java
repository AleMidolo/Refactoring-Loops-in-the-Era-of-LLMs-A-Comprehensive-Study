_rowDependencies.entrySet().stream()
    .skip(1)
    .filter(entry -> entry.getValue().recordIndex >= 0)
    .forEach(entry -> {
        int r = entry.getKey();
        RowDependency rd = entry.getValue();
        _records.add(new Record(recordRowIndex, r, recordIndex++));
        recordIndex = rd.recordIndex;
        recordRowIndex = r;
    });