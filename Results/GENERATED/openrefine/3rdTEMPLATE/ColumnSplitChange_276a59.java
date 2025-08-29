IntStream.range(0, tuple.size())
    .forEach(c -> {
        Serializable value = tuple.get(c);
        if (value != null) {
            newRow.setCell(_firstNewCellIndex + c, new Cell(value, null));
        }
    });