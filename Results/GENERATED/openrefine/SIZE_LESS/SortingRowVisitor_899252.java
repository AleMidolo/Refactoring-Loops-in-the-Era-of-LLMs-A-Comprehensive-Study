_indexedRows.stream()
    .forEach(indexedRow -> {
        _visitor.visit(project, indexedRow.index, sortedIndex, indexedRow.row);
        sortedIndex++;
    });