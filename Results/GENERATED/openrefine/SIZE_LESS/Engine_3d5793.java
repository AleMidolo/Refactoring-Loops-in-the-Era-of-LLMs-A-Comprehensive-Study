project.rows.stream()
    .limit(c)
    .map(project.rows::get)
    .takeWhile(row -> !visitor.visit(project, project.rows.indexOf(row), project.rows.indexOf(row), row))
    .count();