for (int c = 0; c < tuple.size(); c++) {
    Serializable value = tuple.get(c);
    if (value != null) {
        newRow.setCell(_firstNewCellIndex + c, new Cell(value, null));
    }
}