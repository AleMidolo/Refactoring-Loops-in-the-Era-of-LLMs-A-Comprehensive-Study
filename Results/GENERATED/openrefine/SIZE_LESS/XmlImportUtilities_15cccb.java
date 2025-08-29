thisColumnGroup.columns.values().stream()
    .map(column -> column.nextRowIndex)
    .reduce(nextRowIndex, Math::max);