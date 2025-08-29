for (int i = 0; i < count; i++) {
    if (i < rootKeyedGroup.keyCellIndex) {
        rootKeyedGroup.cellIndices[i] = i;
    } else if (i > rootKeyedGroup.keyCellIndex) {
        rootKeyedGroup.cellIndices[i - 1] = i;
    }
}