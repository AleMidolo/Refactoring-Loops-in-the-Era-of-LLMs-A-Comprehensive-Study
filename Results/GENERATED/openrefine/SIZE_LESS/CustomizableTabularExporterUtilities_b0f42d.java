cells = columnNames.stream()
    .map(name -> new CellData(name, name, name, null))
    .collect(Collectors.toList());