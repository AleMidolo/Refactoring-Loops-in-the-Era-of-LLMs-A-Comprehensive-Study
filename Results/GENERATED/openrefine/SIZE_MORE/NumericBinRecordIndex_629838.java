IntStream.range(0, count).forEach(r -> {
    Record record = project.recordModel.getRecord(r);
    preprocessing();
    IntStream.range(record.fromRowIndex, record.toRowIndex).forEach(i -> {
        Row row = project.rows.get(i);
        processRow(project, rowEvaluable, allValues, i, row, bindings);
    });
    postprocessing();
});