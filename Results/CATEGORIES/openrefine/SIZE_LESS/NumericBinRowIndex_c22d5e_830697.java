for (int i = 0; i < project.rows.size(); i++) {
    Row row = project.rows.get(i);
    preprocessing();
    processRow(project, rowEvaluable, allValues, i, row, bindings);
    postprocessing();
}