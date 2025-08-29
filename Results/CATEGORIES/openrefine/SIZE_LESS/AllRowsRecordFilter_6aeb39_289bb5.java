for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    if (!_rowFilter.filterRow(project, r, project.rows.get(r))) {
        return false;
    }
}