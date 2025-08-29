project.rows.stream()
        .limit(c)
        .anyMatch(row -> visitor.visit(project, project.rows.indexOf(row), project.rows.indexOf(row), row));