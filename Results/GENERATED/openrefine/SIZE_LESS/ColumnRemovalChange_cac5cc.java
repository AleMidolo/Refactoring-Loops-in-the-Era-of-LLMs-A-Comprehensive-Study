_oldCells.forEach(c -> {
    c.save(writer, options);
    writer.write('\n');
});