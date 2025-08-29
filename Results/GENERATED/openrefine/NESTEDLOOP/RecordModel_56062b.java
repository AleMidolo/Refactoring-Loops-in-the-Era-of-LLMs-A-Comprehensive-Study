IntStream.range(0, groupCount)
    .forEach(g -> {
        KeyedGroup group = keyedGroups.get(g);
        if (!ExpressionUtils.isNonBlankData(row.getCellValue(keyedGroups.get(0).keyCellIndex)) && !ExpressionUtils.isNonBlankData(row.getCellValue(group.keyCellIndex))) {
            int contextRowIndex = lastNonBlankRowsByGroup[g];
            if (contextRowIndex >= 0) {
                Arrays.stream(group.cellIndices)
                    .filter(dependentCellIndex -> ExpressionUtils.isNonBlankData(row.getCellValue(dependentCellIndex)))
                    .forEach(dependentCellIndex -> setRowDependency(project, rowDependency, dependentCellIndex, contextRowIndex, group.keyCellIndex));
            }
        } else {
            lastNonBlankRowsByGroup[g] = r;
        }
    });