for (int g = 0; g < groupCount; g++) {
    KeyedGroup group = keyedGroups.get(g);
    if (!ExpressionUtils.isNonBlankData(row.getCellValue(keyedGroups.get(0).keyCellIndex)) && !ExpressionUtils.isNonBlankData(row.getCellValue(group.keyCellIndex))) {
        int contextRowIndex = lastNonBlankRowsByGroup[g];
        if (contextRowIndex >= 0) {
            for (int dependentCellIndex : group.cellIndices) {
                if (ExpressionUtils.isNonBlankData(row.getCellValue(dependentCellIndex))) {
                    setRowDependency(project, rowDependency, dependentCellIndex, contextRowIndex, group.keyCellIndex);
                }
            }
        }
    } else {
        lastNonBlankRowsByGroup[g] = r;
    }
}