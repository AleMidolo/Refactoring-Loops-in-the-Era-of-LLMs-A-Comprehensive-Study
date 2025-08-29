record.rows.subList(record.fromRowIndex, record.toRowIndex).stream()
    .forEach(r -> processRow(project, r, project.rows.get(r), bindings));