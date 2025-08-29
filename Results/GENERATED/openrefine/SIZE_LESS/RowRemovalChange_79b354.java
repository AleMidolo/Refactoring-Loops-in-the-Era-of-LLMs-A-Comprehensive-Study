IntStream.range(0, count)
    .forEach(i -> {
        int index = _rowIndices.get(i);
        Row row = _rows.get(i);
        project.rows.add(index, row);
    });