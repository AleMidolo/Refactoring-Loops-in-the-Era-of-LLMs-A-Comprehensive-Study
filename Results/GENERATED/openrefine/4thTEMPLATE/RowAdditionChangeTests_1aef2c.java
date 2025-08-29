project.rows.stream()
    .skip(changeIndex)
    .limit(insertionIndex + changeCount - changeIndex)
    .forEach(row -> assertBlankRow(row));