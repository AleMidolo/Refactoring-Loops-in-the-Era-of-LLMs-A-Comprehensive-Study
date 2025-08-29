for (int r = 0; r < count; r++) {
    Record record = project.recordModel.getRecord(r);
    preprocessing();
    for (int i = record.fromRowIndex; i < record.toRowIndex; i++) {
        Row row = project.rows.get(i);
        processRow(project, rowEvaluable, allValues, i, row, bindings);
    }
    postprocessing();
}