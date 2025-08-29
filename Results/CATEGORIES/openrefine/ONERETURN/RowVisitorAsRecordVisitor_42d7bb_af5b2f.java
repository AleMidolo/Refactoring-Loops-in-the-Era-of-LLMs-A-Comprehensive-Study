for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    if (_rowVisitor.visit(project, r, r, project.rows.get(r))) {
        return true;
    }
}