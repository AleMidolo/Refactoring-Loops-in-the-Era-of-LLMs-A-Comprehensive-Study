wr.row.cells.stream()
    .filter(c -> c != null && c.recon != null)
    .forEach(c -> pool.pool(c.recon));