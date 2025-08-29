rowIdToError.entrySet().stream()
    .map(errorCell -> new CellAtRow(errorCell.getKey(), new Cell(new EvalError(errorCell.getValue()), null)))
    .forEach(cells::add);