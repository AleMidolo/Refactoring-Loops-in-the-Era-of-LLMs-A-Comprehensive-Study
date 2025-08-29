for (Cell c : wr.row.cells) {
    if (c != null && c.recon != null) {
        pool.pool(c.recon);
    }
}