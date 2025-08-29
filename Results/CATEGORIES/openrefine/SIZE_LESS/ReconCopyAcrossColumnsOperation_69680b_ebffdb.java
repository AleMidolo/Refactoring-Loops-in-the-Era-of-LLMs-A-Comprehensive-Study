for (String c : _toColumnNames) {
    Column toColumn = project.columnModel.getColumnByName(c);
    if (toColumn != null) {
        toColumns.add(toColumn);
    }
}