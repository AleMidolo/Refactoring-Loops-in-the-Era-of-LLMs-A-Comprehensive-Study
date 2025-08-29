for (CellAtRow c : _oldCells) {
    c.save(writer, options);
    writer.write('\n');
}