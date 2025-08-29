IntStream.range(columnNames.size(), tuple.size())
    .forEach(i -> {
        int columnNameIndex = 1;
        while (true) {
            String newColumnName = _columnName + " " + columnNameIndex++;
            if (project.columnModel.getColumnByName(newColumnName) == null) {
                columnNames.add(newColumnName);
                break;
            }
        }
    });