for (Column column : project.columnModel.columns) {
    if (column.getName().equals(colname)) {
        _colindex = column.getCellIndex();
    }
}