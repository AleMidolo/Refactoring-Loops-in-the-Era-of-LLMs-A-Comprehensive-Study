for (RowFilter rowFilter : _rowFilters) {
    if (!rowFilter.filterRow(project, rowIndex, row)) {
        return false;
    }
}