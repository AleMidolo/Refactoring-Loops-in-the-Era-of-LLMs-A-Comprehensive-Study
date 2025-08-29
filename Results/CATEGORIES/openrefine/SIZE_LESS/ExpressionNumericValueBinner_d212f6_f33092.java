for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    processRow(project, r, project.rows.get(r), bindings);
}