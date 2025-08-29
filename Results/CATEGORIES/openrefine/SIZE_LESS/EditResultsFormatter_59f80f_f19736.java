for (Entry<Integer, String> errorCell : rowIdToError.entrySet()) {
    cells.add(new CellAtRow(errorCell.getKey(), new Cell(new EvalError(errorCell.getValue()), null)));
}