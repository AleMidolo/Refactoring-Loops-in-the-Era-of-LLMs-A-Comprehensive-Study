IntStream.range(0, l)
    .mapToObj(i -> JsonValueConverter.convert(a.get(i)))
    .filter(Objects::nonNull)
    .forEach(o -> {
        if (!isFirst) {
            sb.append(separator);
        }
        sb.append(o).toString();
        isFirst = false;
    });