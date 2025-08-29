project.rows.stream()
    .limit(c)
    .map(row -> project.rows.get(row))
    .takeWhile(row -> visitor.visit(project, row, row))
    .forEach(row -> {});