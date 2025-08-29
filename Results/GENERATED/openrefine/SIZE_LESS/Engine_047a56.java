project.rows.stream()
        .limit(c)
        .anyMatch(row -> {
            int rowIndex = project.rows.indexOf(row);
            return visitor.visit(project, rowIndex, rowIndex, row);
        });