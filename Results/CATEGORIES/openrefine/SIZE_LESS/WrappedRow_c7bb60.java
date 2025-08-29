for (int r = _record.fromRowIndex; r < _record.toRowIndex; r++) {
    Row row = project.rows.get(r);
    Cell cell = row.getCell(cellIndex);
    if (cell != null && ExpressionUtils.isNonBlankData(cell.value)) {
        cells.add(new WrappedCell(project, name, cell));
    }
}