this.visitor.references.stream()
    .forEach(row -> IntStream.range(0, row.size())
        .forEach(i -> IntStream.range(columnReferenced.size(), i+1)
            .forEach(j -> columnReferenced.add(false)));
                 
this.visitor.references.stream()
    .forEach(row -> IntStream.range(0, row.size())
        .filter(i -> row.get(i) != null)
        .forEach(i -> columnReferenced.set(i, true));