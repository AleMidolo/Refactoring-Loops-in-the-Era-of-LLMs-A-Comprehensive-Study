for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    visit(project, r, r, project.rows.get(r));
}