for (int rowIndex = 0; rowIndex < c; rowIndex++) {
    Row row = project.rows.get(rowIndex);
    if (visitor.visit(project, rowIndex, rowIndex, row)) {
        break;
    }
}