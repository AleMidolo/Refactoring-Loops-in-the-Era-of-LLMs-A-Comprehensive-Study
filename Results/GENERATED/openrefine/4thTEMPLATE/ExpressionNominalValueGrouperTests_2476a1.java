project.rows.stream()
    .forEach(row -> grouper.visit(project, project.rows.indexOf(row), project.rows.indexOf(row), row));