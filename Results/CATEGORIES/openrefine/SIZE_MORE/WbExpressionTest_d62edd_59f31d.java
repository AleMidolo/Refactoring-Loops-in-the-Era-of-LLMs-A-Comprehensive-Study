for (int i = 0; i != rowValues.length; i++) {
    Object val = rowValues[i];
    if (Cell.class.isInstance(val)) {
        row.cells.add((Cell) val);
    } else {
        Cell cell = new Cell((Serializable) val, (Recon) null);
        row.cells.add(cell);
    }
}