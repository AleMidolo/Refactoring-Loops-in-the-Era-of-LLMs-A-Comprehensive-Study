groups.stream()
    .map(group -> {
        jobs.add(group.job);
        jobToGroup.put(group.job, group);
        return group;
    })
    .forEach(group -> {
        List<Recon> recons = _reconConfig.batchRecon(jobs, _historyEntryID);
        IntStream.range(0, jobs.size())
            .mapToObj(j -> {
                ReconJob job = jobs.get(j);
                Recon recon = j < recons.size() ? recons.get(j) : null;
                JobGroup groupForJob = jobToGroup.get(job);
                List<ReconEntry> entries = groupForJob.entries;
                jobToGroup.remove(job);
                jobs.remove(j);
                done++;
                if (recon != null) {
                    recon.judgmentBatchSize = entries.size();
                }
                return entries.stream().filter(entry -> recon != null)
                    .map(entry -> {
                        Cell oldCell = entry.cell;
                        Cell newCell = new Cell(oldCell.value, recon);
                        return new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
                    })
                    .collect(Collectors.toList());
            }).flatMap(List::stream)
            .forEach(cellChanges::add);
        _progress = done * 100 / groups.size();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            if (_canceled) {
                return;
            }
        }
    });