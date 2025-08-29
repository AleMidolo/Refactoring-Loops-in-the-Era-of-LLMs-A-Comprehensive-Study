 IntStream.range(0, count)
        .mapToObj(i -> _rowIndices.get(i))
        .map(index -> project.rows.remove(index + offset))
        .forEach(row -> _rows.add(row));
        offset--;