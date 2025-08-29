columnNames.stream()
    .skip(columnNames.size())
    .limit(tuple.size() - columnNames.size())
    .forEach(i -> {
        int columnNameIndex = 0;
        while (true) {
            String newColumnName = _columnName + " " + columnNameIndex++;
            if (project.columnModel.getColumnByName(newColumnName) == null) {
                columnNames.add(newColumnName);
                break;
            }
        }
    });