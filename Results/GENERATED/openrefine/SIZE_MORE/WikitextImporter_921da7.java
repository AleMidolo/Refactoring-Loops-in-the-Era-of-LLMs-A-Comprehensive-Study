this.visitor.wikilinkedCells.stream()
    .skip(batchStart)
    .limit(batchSize)
    .filter(cell -> cell.col < totalSize)
    .forEach(cell -> {
        Recon recon = recons.get(cell.col - batchStart);
        if (recon != null) {
            reconList.get(cell.row).set(cell.col, recon);
            columnReconciled.set(cell.col, true);
        }
    });