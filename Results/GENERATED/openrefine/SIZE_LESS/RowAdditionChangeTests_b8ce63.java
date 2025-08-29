newRows.stream()
    .skip(insertionIndex)
    .forEach(row -> assertBlankRow(project.rows.get(project.rows.indexOf(row))));