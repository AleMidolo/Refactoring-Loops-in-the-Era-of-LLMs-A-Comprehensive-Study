record.rows.subList(record.fromRowIndex, record.toRowIndex)
	.stream()
	.map(r -> makeKey(project, project.rows.get(r), r))
	.filter(key -> ExpressionUtils.isError(key))
	.forEach(key -> error = key);

finalKey = record.rows.subList(record.fromRowIndex, record.toRowIndex)
	.stream()
	.map(r -> makeKey(project, project.rows.get(r), r))
	.filter(key -> ExpressionUtils.isNonBlankData(key))
	.reduce(null, (finalKey, key) -> {
		if (finalKey == null) {
			return key;
		} else {
			int c = compareKeys(finalKey, key);
			if (reverse) {
				return (c < 0) ? key : finalKey;
			} else {
				return (c > 0) ? key : finalKey;
			}
		}
	});