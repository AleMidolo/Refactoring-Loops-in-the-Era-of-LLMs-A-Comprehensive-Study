for (CellDependency cd : rowDependency.cellDependencies) {
    if (cd != null) {
        rowDependency.contextRows.add(cd.rowIndex);
    }
}