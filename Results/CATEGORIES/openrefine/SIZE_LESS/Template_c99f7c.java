for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    Row row = project.rows.get(r);
    bindings.put("rowIndex", r);
    internalVisit(project, r, row);
    bindings.remove("recordIndex");
}