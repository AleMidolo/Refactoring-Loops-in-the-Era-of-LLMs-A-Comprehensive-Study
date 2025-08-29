for (int i = 0; i < columns.size(); i++) {
    ImportColumn c = columns.get(i);
    Column column = new com.google.refine.model.Column(c.cellIndex, c.name);
    project.columnModel.columns.add(column);
}