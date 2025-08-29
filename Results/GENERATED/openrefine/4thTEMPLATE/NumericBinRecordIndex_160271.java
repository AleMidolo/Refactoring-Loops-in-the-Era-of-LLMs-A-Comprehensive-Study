project.rows.stream()
    .skip(record.fromRowIndex)
    .limit(record.toRowIndex - record.fromRowIndex)
    .forEach(row -> processRow(project, rowEvaluable, allValues, project.rows.indexOf(row), row, bindings));