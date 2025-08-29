for (int r = 0; r < rowCount; r++) {
    Row row = rows.get(r);
    RowDependency rowDependency = new RowDependency();
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
    if (rowDependency.cellDependencies != null && rowDependency.cellDependencies.length > 0) {
        rowDependency.recordIndex = -1;
        rowDependency.contextRows = new ArrayList<Integer>();
        for (CellDependency cd : rowDependency.cellDependencies) {
            if (cd != null) {
                rowDependency.contextRows.add(cd.rowIndex);
            }
        }
        Collections.sort(rowDependency.contextRows);
    } else {
        rowDependency.recordIndex = recordIndex++;
    }
    _rowDependencies.add(rowDependency);
}