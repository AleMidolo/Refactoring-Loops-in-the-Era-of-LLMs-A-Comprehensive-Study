for (Column column : columns) {
    String name = column.getName();
    columnNames.add(name);
    columnNameToFormatter.put(name, new CellFormatter());
}