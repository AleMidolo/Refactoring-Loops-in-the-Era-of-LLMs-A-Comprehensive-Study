row.stream()
    .filter(Objects::nonNull)
    .forEach(data -> columnReferenced.set(row.indexOf(data), true));