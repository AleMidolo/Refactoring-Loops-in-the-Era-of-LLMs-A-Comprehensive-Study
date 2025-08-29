groups.stream().forEach(group -> {
    while (jobs.size() < batchSize && i < groups.size()) {
        JobGroup jobGroup = groups.get(i++);
        jobs.add(jobGroup.job);
        jobToGroup.put(jobGroup.job, jobGroup);
    }
    List<Recon> recons = _reconConfig.batchRecon(jobs, _historyEntryID);
    for (int j = jobs.size() - 1; j >= 0; j--) {
        ReconJob job = jobs.get(j);
        Recon recon = j < recons.size() ? recons.get(j) : null;
        JobGroup jobGroup = jobToGroup.get(job);
        List<ReconEntry> entries = jobGroup.entries;
        jobToGroup.remove(job);
        jobs.remove(j);
        done++;
        if (recon != null) {
            recon.judgmentBatchSize = entries.size();
        }
        entries.forEach(entry -> {
            if (recon == null) {
                Cell oldCell = entry.cell;
                logger.warn("We have a null recon here" + " " + oldCell + " " + entry.rowIndex);
                return;
            }
            Cell oldCell = entry.cell;
            Cell newCell = new Cell(oldCell.value, recon);
            CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
            cellChanges.add(cellChange);
        });
    }
    _progress = done * 100 / groups.size();
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        if (_canceled) {
            break;
        }
    }
});