cells.stream()
     .map(cellData -> cellData.text)
     .forEach(columnNames::add);