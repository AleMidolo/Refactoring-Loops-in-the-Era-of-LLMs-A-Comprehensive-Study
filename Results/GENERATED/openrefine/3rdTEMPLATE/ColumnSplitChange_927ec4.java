tuple.stream()
     .filter(Objects::nonNull)
     .forEach(value -> newRow.setCell(_firstNewCellIndex + tuple.indexOf(value), new Cell(value, null));