_rowIndices.stream()
    .forEach(rowIndex -> {
        writer.write(rowIndex.toString());
        writer.write('\n');
    });