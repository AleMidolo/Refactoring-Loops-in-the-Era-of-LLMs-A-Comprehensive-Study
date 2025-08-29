group.cellIndices.stream()
    .filter(dependentCellIndex -> ExpressionUtils.isNonBlankData(row.getCellValue(dependentCellIndex)))
    .forEach(dependentCellIndex -> setRowDependency(project, rowDependency, dependentCellIndex, contextRowIndex, group.keyCellIndex));