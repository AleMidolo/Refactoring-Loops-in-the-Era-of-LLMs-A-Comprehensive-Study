project.rows.subList(insertionIndex, newRows.size())
    .forEach(row -> assertSame(row, newRows.get(project.rows.indexOf(row))));