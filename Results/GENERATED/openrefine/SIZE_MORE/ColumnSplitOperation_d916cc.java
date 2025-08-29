columnNames.stream()
    .skip(columnNames.size())
    .forEach(columnName -> {
        int columnNameIndex = 0;
        while (true) {
            String newColumnName = _columnName + " " + columnNameIndex++;
            if (project.columnModel.getColumnByName(newColumnName) == null) {
                columnNames.add(newColumnName);
                break;
            }
        }
    });