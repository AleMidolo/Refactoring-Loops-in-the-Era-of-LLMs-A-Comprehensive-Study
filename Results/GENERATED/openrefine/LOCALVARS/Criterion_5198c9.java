record.stream()
    .limit(record.toRowIndex - record.fromRowIndex)
    .map(r -> makeKey(project, project.rows.get(r), r))
    .filter(ExpressionUtils::isNotBlankData)
    .reduce((key1, key2) -> reverse ? (compareKeys(key1, key2) < 0 ? key2 : key1) : (compareKeys(key1, key2) > 0 ? key2 : key1))
    .ifPresent(key -> {
        if (!ExpressionUtils.isError(key)) {
            finalKey = key;
        } else {
            error = key;
        }
    });