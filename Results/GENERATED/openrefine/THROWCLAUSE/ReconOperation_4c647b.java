groups.stream().forEach(group -> {
    while (jobs.size() < batchSize) {
        if (i < groups.size()) {
            JobGroup currentGroup = groups.get(i++);
            jobs.add(currentGroup.job);
            jobToGroup.put(currentGroup.job, currentGroup);
        } else {
            break;
        }
    }

    List<Recon> recons = _reconConfig.batchRecon(jobs, _historyEntryID);

    IntStream.range(0, jobs.size())
             .mapToObj(j -> jobs.get(j))
             .forEach(job -> {
                 Recon recon = jobs.indexOf(job) < recons.size() ? recons.get(jobs.indexOf(job)) : null;
                 JobGroup group = jobToGroup.get(job);
                 List<ReconEntry> entries = group.entries;
                 jobToGroup.remove(job);
                 jobs.remove(job);
                 done++;
                 if (recon != null) {
                     recon.judgmentBatchSize = entries.size();
                 }
                 entries.stream()
                        .filter(entry -> recon != null)
                        .forEach(entry -> {
                            Cell oldCell = entry.cell;
                            Cell newCell = new Cell(oldCell.value, recon);
                            CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
                            cellChanges.add(cellChange);
                        });
             });

    _progress = done * 100 / groups.size();
    
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        if (_canceled) {
            return;
        }
    }
});