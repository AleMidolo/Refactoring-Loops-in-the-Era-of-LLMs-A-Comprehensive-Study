statement.getReferences().stream()
    .forEach(ref -> scrutinizeSnakSet(ref.getAllSnaks(), entityId, SnakPosition.REFERENCE, added));