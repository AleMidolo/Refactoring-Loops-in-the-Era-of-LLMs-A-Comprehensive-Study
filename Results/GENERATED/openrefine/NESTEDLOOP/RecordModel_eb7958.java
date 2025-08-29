columnModel.columnGroups.stream()
        .filter(group -> group.keyColumnIndex >= 0)
        .forEach(group -> {
            KeyedGroup keyedGroup = new KeyedGroup();
            keyedGroup.keyCellIndex = columnModel.columns.get(group.keyColumnIndex).getCellIndex();
            keyedGroup.cellIndices = new int[group.columnSpan - 1];
            AtomicReference<Integer> c = new AtomicReference<>(0);
            IntStream.range(0, group.columnSpan)
                    .map(i -> group.startColumnIndex + i)
                    .filter(columnIndex -> columnIndex != group.keyColumnIndex && columnIndex < columnModel.columns.size())
                    .forEach(columnIndex -> keyedGroup.cellIndices[c.getAndSet(c.get() + 1)] = columnModel.columns.get(columnIndex).getCellIndex());
            keyedGroups.add(keyedGroup);
        });