groups.stream()
        .flatMap(group -> Stream.generate(() -> group).limit(batchSize))
        .forEach(group -> {
            jobs.add(group.job);
            jobToGroup.put(group.job, group);
        });
List<Recon> recons = _reconConfig.batchRecon(jobs, _historyEntryID);
IntStream.range(0, jobs.size())
        .mapToObj(j -> jobs.size() - 1 - j)
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
        _progress = done * 100 / groups.size();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            if (_canceled) {
                return;
            }
        }
    });