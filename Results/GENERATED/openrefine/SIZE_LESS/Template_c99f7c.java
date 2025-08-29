project.rows.stream()
    .skip(record.fromRowIndex)
    .limit(record.toRowIndex - record.fromRowIndex)
    .forEach(row -> {
        int r = project.rows.indexOf(row);
        bindings.put("rowIndex", r);
        internalVisit(project, r, row);
        bindings.remove("recordIndex");
    });