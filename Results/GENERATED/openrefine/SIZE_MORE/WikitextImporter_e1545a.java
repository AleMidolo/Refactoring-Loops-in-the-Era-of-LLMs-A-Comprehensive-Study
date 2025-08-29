this.visitor.references.stream()
    .forEach(row -> IntStream.range(0, row.size())
        .forEach(i -> {
            while (i >= columnReferenced.size()) {
                columnReferenced.add(false);
            }
            if (row.get(i) != null) {
                columnReferenced.set(i, true);
            }
        })
    );