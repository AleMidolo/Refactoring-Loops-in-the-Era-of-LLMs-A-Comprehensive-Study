for (int i = columnNames.size(); i < tuple.size(); i++) {
    while (true) {
        String newColumnName = _columnName + " " + columnNameIndex++;
        if (project.columnModel.getColumnByName(newColumnName) == null) {
            columnNames.add(newColumnName);
            break;
        }
    }
}