for (int r = 0; r < c; r++) {
    Record record = project.recordModel.getRecord(r);
    visitor.visit(project, record.fromRowIndex, record);
}