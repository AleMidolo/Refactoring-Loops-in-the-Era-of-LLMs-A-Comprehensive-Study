columns.stream()
    .map(Column::getName)
    .forEach(name -> {
        columnNames.add(name);
        columnNameToFormatter.put(name, new CellFormatter());
    });