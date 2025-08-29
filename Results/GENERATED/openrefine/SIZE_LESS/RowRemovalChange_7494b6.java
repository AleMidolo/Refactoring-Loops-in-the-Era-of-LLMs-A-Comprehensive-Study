_rowIndices.stream().forEach(index -> {
    writer.write(index.toString());
    writer.write('\n');
});