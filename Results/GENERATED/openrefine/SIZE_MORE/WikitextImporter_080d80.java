origRow.stream()
        .map(value -> {
            Recon recon = (currentRow >= 0 && reconList != null) ? reconList.get(currentRow).get(origRow.indexOf(value)) : null;
            return new Cell(value, recon);
        })
        .forEach(cell -> row.add(cell));

if (columnReferenced != null) {
    IntStream.range(0, origRow.size())
            .filter(i -> i < columnReferenced.size() && columnReferenced.get(i))
            .forEach(i -> {
                String refValue = (currentRow == -1) ? origRow.get(i) + "_ref" : refRow.get(i);
                Cell cell = (refValue != null) ? new Cell(refValue, null) : null;
                row.add(cell);
            });
}