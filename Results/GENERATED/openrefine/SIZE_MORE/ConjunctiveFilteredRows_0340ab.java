project.rows.stream()
    .limit(c)
    .filter(row -> matchRow(project, project.rows.indexOf(row), row))
    .anyMatch(row -> visitRow(project, visitor, project.rows.indexOf(row), row));