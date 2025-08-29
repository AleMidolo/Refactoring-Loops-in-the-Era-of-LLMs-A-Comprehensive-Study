record.rows.subList(record.fromRowIndex, record.toRowIndex).stream()
    .anyMatch(r -> _rowVisitor.visit(project, r, r, project.rows.get(r)));