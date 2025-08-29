record.rows.subList(record.fromRowIndex, record.toRowIndex)
    .stream()
    .anyMatch(row -> _rowVisitor.visit(project, row, row, project.rows.get(row)));