thisColumnGroup.subgroups.values().stream()
        .mapToInt(columnGroup2 -> columnGroup2.nextRowIndex)
        .reduce(nextRowIndex, Math::max);