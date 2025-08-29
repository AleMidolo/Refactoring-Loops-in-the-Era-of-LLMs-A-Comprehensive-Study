for (int r = 0; r < c; r++) {
    Record record = project.recordModel.getRecord(r);
    grouper.visit(project, record.fromRowIndex, record);
}