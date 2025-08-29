newRows.stream()
        .skip(insertionIndex)
        .map(row -> project.rows.get(row))
        .forEach(this::assertBlankRow);