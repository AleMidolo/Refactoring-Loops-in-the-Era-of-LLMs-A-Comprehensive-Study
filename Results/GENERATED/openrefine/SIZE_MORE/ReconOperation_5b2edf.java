groups.stream()
        .map(group -> {
            while (jobs.size() < batchSize && i < groups.size()) {
                JobGroup group = groups.get(i++);
                jobs.add(group.job);
                jobToGroup.put(group.job, group);
            }
            return group;
        })
        .map(group -> _reconConfig.batchRecon(jobs, _historyEntryID))
        .forEach(recons -> {
            IntStream.range(jobs.size() - 1, 0)
                    .mapToObj(j -> {
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
                        return entries.stream()
                                .map(entry -> {
                                    if (recon == null) {
                                        Cell oldCell = entry.cell;
                                        logger.warn("We have a null recon here" + " " + oldCell + " " + entry.rowIndex);
                                        return null;
                                    }
                                    Cell oldCell = entry.cell;
                                    Cell newCell = new Cell(oldCell.value, recon);
                                    return new CellChange(entry.rowIndex, _cellIndex, oldCell, newCell);
                                })
                                .filter(Objects::nonNull)
                                .forEach(cellChanges::add);
                    });
            _progress = done * 100 / groups.size();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                if (_canceled) {
                    throw new RuntimeException("Task canceled", e);
                }
            }
        });