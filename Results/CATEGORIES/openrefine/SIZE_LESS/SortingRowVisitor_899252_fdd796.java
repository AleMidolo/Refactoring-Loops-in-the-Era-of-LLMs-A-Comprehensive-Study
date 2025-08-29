for (IndexedRow indexedRow : _indexedRows) {
    _visitor.visit(project, indexedRow.index, sortedIndex, indexedRow.row);
    sortedIndex++;
}