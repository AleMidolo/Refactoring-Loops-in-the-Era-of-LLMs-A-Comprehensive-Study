groups.stream()
        .flatMap(group -> {
            List<JobGroup> groupList = new ArrayList<>();
            while (jobs.size() < batchSize && groups.indexOf(group) < groups.size()) {
                groupList.add(group);
                jobs.add(group.job);
            }
            return groupList.stream();
        })
        .map(group -> _reconConfig.batchRecon(jobs, _historyEntryID))
        .forEach(recons -> IntStream.range(jobs.size() - 1, 0)
                .forEach(j -> {
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
                    entries.stream()
                            .forEach(entry -> {
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
                }));
_progress = done * 100 / groups.size();
try {
    Thread.sleep(50);
} catch (InterruptedException e) {
    if (_canceled) {
        break;
    }
}