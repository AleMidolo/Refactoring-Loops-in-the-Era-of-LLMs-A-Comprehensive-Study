project.rows.subList(record.fromRowIndex, record.toRowIndex)
    .forEach(row -> {
        bindings.put("rowIndex", project.rows.indexOf(row));
        internalVisit(project, project.rows.indexOf(row), row);
        bindings.remove("recordIndex");
    });