IntStream.range(record.fromRowIndex, record.toRowIndex)
    .forEach(r -> processRow(project, r, project.rows.get(r), bindings));