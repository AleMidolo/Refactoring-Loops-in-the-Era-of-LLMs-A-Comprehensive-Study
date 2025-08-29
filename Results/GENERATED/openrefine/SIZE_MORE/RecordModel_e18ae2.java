IntStream.range(0, count)
    .forEach(i -> {
        if (i < rootKeyedGroup.keyCellIndex) {
            rootKeyedGroup.cellIndices[i] = i;
        } else if (i > rootKeyedGroup.keyCellIndex) {
            rootKeyedGroup.cellIndices[i - 1] = i;
        }
    });