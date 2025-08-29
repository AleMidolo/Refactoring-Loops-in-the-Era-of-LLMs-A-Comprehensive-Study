for (int j = batchStart; j < batchStart + batchSize && j < totalSize; j++) {
    WikilinkedCell cell = this.visitor.wikilinkedCells.get(j);
    Recon recon = recons.get(j - batchStart);
    if (recon != null) {
        reconList.get(cell.row).set(cell.col, recon);
        columnReconciled.set(cell.col, true);
    }
}