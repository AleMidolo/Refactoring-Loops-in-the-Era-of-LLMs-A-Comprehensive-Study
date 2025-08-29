for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
    Row row = project.rows.get(rowIndex);
    grouper.visit(project, rowIndex, rowIndex, row);
}