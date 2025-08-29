thisColumnGroup.subgroups.values().stream()
    .mapToInt(columnGroup2 -> columnGroup2.nextRowIndex)
    .max()
    .ifPresent(value -> nextRowIndex = Math.max(nextRowIndex, value));