groups.stream()
    .map(group -> {
        jobs.add(group.job);
        jobToGroup.put(group.job, group);
        return group;
    })
    .collect(Collectors.toList())
    .forEach(group -> {
        List<Recon> recons = _reconConfig.batchRecon(jobs, _historyEntryID);
        IntStream.range(0, jobs.size())
            .mapToObj(j -> jobs.get(j))
            .forEach(job -> {
                int j = jobs.indexOf(job);
                Recon recon = j < recons.size() ? recons.get(j) : null;
                JobGroup group = jobToGroup.get(job);
                List<ReconEntry> entries = group.entries;
                jobToGroup.remove(job);
                jobs.remove(job);
                done++;
                if (recon != null) {
                    recon.judgmentBatchSize = entries.size();
                }
                entries.stream().filter(entry -> recon != null)
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