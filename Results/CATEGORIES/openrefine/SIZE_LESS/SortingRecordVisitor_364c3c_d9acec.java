for (Record record : _records) {
    _visitor.visit(project, sortedIndex, record);
    sortedIndex += record.toRowIndex - record.fromRowIndex;
}