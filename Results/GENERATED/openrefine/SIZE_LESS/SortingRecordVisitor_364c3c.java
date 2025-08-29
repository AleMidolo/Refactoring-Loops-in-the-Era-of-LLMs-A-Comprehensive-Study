_records.stream()
    .forEach(record -> {
        _visitor.visit(project, sortedIndex, record);
        sortedIndex += record.toRowIndex - record.fromRowIndex;
    });