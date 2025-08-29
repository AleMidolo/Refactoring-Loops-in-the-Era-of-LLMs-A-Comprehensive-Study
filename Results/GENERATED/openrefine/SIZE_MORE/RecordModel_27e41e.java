_rowDependencies.entrySet().stream()
    .skip(1)
    .filter(entry -> entry.getValue().recordIndex >= 0)
    .forEach(entry -> {
        RowDependency rd = entry.getValue();
        _records.add(new Record(recordRowIndex, entry.getKey(), recordIndex++));
        recordIndex = rd.recordIndex;
        recordRowIndex = entry.getKey();
    });