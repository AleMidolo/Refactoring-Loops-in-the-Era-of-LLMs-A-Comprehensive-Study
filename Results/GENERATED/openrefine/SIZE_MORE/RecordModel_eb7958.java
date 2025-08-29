columnModel.columnGroups.stream()
    .filter(group -> group.keyColumnIndex >= 0)
    .forEach(group -> {
        KeyedGroup keyedGroup = new KeyedGroup();
        keyedGroup.keyCellIndex = columnModel.columns.get(group.keyColumnIndex).getCellIndex();
        keyedGroup.cellIndices = new int[group.columnSpan - 1];
        AtomicInteger c = new AtomicInteger(0);
        IntStream.range(0, group.columnSpan)
            .mapToObj(i -> group.startColumnIndex + i)
            .filter(columnIndex -> columnIndex != group.keyColumnIndex && columnIndex < columnModel.columns.size())
            .forEach(columnIndex -> {
                int cellIndex = columnModel.columns.get(columnIndex).getCellIndex();
                keyedGroup.cellIndices[c.getAndIncrement()] = cellIndex;
            });
        keyedGroups.add(keyedGroup);
    });