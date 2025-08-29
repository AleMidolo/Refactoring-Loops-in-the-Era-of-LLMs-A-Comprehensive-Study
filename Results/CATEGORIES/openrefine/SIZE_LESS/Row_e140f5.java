for (Cell c : cells) {
    if (c != null && c.recon != null) {
        pool.pool(c.recon);
    }
}