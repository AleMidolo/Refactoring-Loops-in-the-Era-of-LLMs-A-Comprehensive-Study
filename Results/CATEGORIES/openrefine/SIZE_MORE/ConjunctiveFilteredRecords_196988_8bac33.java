for (int r = 0; r < c; r++) {
    Record record = project.recordModel.getRecord(r);
    if (matchRecord(project, record)) {
        if (visitor.visit(project, record.fromRowIndex, record)) {
            return;
        }
    }
}