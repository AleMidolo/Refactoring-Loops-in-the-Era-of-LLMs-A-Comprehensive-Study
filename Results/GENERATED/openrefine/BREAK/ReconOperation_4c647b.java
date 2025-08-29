groups.stream().forEach(group -> {
    List<Job> jobs = new ArrayList<>();
    Map<Job, JobGroup> jobToGroup = new HashMap<>();
    
    int i = groups.indexOf(group);
    while (jobs.size() < batchSize && i < groups.size()) {
        JobGroup currentGroup = groups.get(i++);
        jobs.add(currentGroup.job);
        jobToGroup.put(currentGroup.job, currentGroup);
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
        entries.stream().filter(entry -> recon != null).forEach(entry -> {
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