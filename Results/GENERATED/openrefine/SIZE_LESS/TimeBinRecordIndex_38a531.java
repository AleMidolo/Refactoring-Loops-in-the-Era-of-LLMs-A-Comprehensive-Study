
record.rows.stream().skip(record.fromRowIndex).limit(record.toRowIndex - record.fromRowIndex).forEach(i -> {
    Row row = project.rows.get(i);
    processRow(project, rowEvaluable, allValues, i, row, bindings);
});