rows.stream().forEach(row -> {
    RowDependency rowDependency = new RowDependency();
    keyedGroups.stream().forEach(group -> {
        if (!ExpressionUtils.isNonBlankData(row.getCellValue(keyedGroups.get(0).keyCellIndex)) && !ExpressionUtils.isNonBlankData(row.getCellValue(group.keyCellIndex))) {
            int contextRowIndex = lastNonBlankRowsByGroup[keyedGroups.indexOf(group)];
            if (contextRowIndex >= 0) {
                group.cellIndices.stream().forEach(dependentCellIndex -> {
                    if (ExpressionUtils.isNonBlankData(row.getCellValue(dependentCellIndex))) {
                        setRowDependency(project, rowDependency, dependentCellIndex, contextRowIndex, group.keyCellIndex);
                    }
                });
            }
        } else {
            lastNonBlankRowsByGroup[keyedGroups.indexOf(group)] = rows.indexOf(row);
        }
    });
    if (rowDependency.cellDependencies != null && rowDependency.cellDependencies.length > 0) {
        rowDependency.recordIndex = -1;
        rowDependency.contextRows = Arrays.stream(rowDependency.cellDependencies)
                                          .filter(Objects::nonNull)
                                          .map(cd -> cd.rowIndex)
                                          .collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(rowDependency.contextRows);
    } else {
        rowDependency.recordIndex = recordIndex++;
    }
    _rowDependencies.add(rowDependency);
});