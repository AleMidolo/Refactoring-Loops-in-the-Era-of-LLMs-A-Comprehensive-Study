rows.stream()
    .forEach(row -> {
        RowDependency rowDependency = new RowDependency();
        IntStream.range(0, groupCount)
            .forEach(g -> {
                KeyedGroup group = keyedGroups.get(g);
                if (!ExpressionUtils.isNonBlankData(row.getCellValue(keyedGroups.get(0).keyCellIndex)) && !ExpressionUtils.isNonBlankData(row.getCellValue(group.keyCellIndex))) {
                    int contextRowIndex = lastNonBlankRowsByGroup[g];
                    if (contextRowIndex >= 0) {
                        group.cellIndices.stream()
                            .forEach(dependentCellIndex -> {
                                if (ExpressionUtils.isNonBlankData(row.getCellValue(dependentCellIndex))) {
                                    setRowDependency(project, rowDependency, dependentCellIndex, contextRowIndex, group.keyCellIndex);
                                }
                            });
                    }
                } else {
                    lastNonBlankRowsByGroup[g] = r;
                }
            });
        
        if (rowDependency.cellDependencies != null && rowDependency.cellDependencies.length > 0) {
            rowDependency.recordIndex = -1;
            rowDependency.contextRows = Arrays.stream(rowDependency.cellDependencies)
                .filter(Objects::nonNull)
                .map(cd -> cd.rowIndex)
                .collect(Collectors.toList());
            Collections.sort(rowDependency.contextRows);
        } else {
            rowDependency.recordIndex = recordIndex++;
        }
        _rowDependencies.add(rowDependency);
    });