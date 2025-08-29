for (int dependentCellIndex : group.cellIndices) {
    if (ExpressionUtils.isNonBlankData(row.getCellValue(dependentCellIndex))) {
        setRowDependency(project, rowDependency, dependentCellIndex, contextRowIndex, group.keyCellIndex);
    }
}