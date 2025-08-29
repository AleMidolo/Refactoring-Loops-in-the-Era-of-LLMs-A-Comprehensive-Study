Arrays.stream((Object[]) v)
	.filter(Objects::nonNull)
	.forEach(o -> {
		if (!isFirst) {
			sb.append(separator);
		}
		sb.append(o);
		isFirst = false;
	});