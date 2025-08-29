project.rows.stream()
    .forEach(row -> {
        preprocessing();
        processRow(project, rowEvaluable, allValues, project.rows.indexOf(row), row, bindings);
        postprocessing();
    });