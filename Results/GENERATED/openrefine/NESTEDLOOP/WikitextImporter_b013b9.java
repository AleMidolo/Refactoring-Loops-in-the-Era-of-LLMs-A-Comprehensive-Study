this.visitor.rows.stream()
    .map(row -> {
        int rowSize = row.size();
        List<Recon> recons = new ArrayList<>(rowSize);
        IntStream.range(0, rowSize)
            .forEach(j -> {
                recons.add(null);
                if (j >= columnReconciled.size())
                    columnReconciled.add(false);
            });
        return recons;
    })
    .forEach(reconList::add);