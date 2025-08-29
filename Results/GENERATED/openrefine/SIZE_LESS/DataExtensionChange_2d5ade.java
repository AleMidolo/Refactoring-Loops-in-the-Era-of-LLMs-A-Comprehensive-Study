_rowIndices.stream()
    .map(rowIndex -> rowIndex.toString() + '\n')
    .forEach(writer::write);