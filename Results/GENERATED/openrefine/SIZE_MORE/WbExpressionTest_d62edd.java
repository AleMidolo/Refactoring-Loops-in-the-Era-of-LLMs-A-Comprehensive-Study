Arrays.stream(rowValues)
    .map(val -> Cell.class.isInstance(val) ? (Cell) val : new Cell((Serializable) val, (Recon) null))
    .forEach(row.cells::add);