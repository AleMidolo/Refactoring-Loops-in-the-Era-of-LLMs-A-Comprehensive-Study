for (Column c : project.columnModel.columns) {
    newColumns.add(new Column(c.getCellIndex() + 1, c.getName()));
}