for (int j = jobs.size() - 1; j >= 0; j--) {
    ReconJob job = jobs.get(j);
    Recon recon = j < recons.size() ? recons.get(j) : null;
    JobGroup group = jobToGroup.get(job);
    List<ReconEntry> entries = group.entries;
    jobToGroup.remove(job);
    jobs.remove(j);
    done++;
    if (recon != null) {
        recon.judgmentBatchSize = entries.size();
    }
    entries.stream().filter(entry -> recon != null).forEach(entry -> {
        Cell oldCell = entry.cell;
        Cell newCell = new Cell(oldCell.value, recon);
        CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
        cellChanges.add(cellChange);
    });
}