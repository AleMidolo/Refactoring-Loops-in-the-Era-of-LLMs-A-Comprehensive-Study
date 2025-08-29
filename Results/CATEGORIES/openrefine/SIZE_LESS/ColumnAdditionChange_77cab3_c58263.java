for (CellAtRow c : _newCells) {
    c.save(writer, options);
    writer.write('\n');
}