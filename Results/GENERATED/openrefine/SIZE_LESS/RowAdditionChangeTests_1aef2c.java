project.rows.subList(changeIndex, insertionIndex + changeCount).stream()
    .forEach(row -> assertBlankRow(row));