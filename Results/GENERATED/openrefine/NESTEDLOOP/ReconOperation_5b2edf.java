groups.stream()
        .flatMap(group -> Stream.generate(() -> group)
                               .limit(batchSize - jobs.size())
                               .takeWhile(gr -> i < groups.size()))
        .forEach(group -> {
            jobs.add(group.job);
            jobToGroup.put(group.job, group);
        });

_reconConfig.batchRecon(jobs, _historyEntryID)
        .forEach(recon -> {
            IntStream.range(jobs.size() - 1, -1, -1)
                     .forEach(j -> {
                         ReconJob job = jobs.get(j);
                         Recon reconObj = j < recons.size() ? recons.get(j) : null;
                         JobGroup group = jobToGroup.get(job);
                         List<ReconEntry> entries = group.entries;
                         jobToGroup.remove(job);
                         jobs.remove(j);
                         done++;
                         if (reconObj != null) {
                             reconObj.judgmentBatchSize = entries.size();
                         }
                         entries.forEach(entry -> {
                             if (reconObj == null) {
                                 Cell oldCell = entry.cell;
                                 logger.warn("We have a null recon here" + " " + oldCell + " " + entry.rowIndex);
                                 return;
                             }
                             Cell oldCell = entry.cell;
                             Cell newCell = new Cell(oldCell.value, reconObj);
                             CellChange cellChange = new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
                             cellChanges.add(cellChange);
                         });
                     });
        });

_progress = done * 100 / groups.size();
try {
    Thread.sleep(50);
} catch (InterruptedException e) {
    if (_canceled) {
        break;
    }
}