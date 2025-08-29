row.stream()
        .filter(Objects::nonNull)
        .forEach(i -> {
            while (columnReferenced.size() <= i) {
                columnReferenced.add(false);
            }
            columnReferenced.set(i, true);
        });