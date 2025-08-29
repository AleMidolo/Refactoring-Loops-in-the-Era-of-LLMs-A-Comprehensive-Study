a.stream()
    .map(JsonValueConverter::convert)
    .filter(Objects::nonNull)
    .forEach(o -> {
        if (!isFirst) {
            sb.append(separator);
        }
        sb.append(o).toString();
        isFirst = false;
    });