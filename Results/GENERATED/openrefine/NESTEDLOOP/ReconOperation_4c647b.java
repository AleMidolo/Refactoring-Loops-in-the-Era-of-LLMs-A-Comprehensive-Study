groups.stream()
        .forEach(group -> {
            while (jobs.size() < batchSize && i < groups.size()) {
                JobGroup currentGroup = groups.get(i++);
                jobs.add(currentGroup.job);
                jobToGroup.put(currentGroup.job, currentGroup);
            }
            List<Recon> recons = _reconConfig.batchRecon(jobs, _historyEntryID);
            IntStream.range(0, jobs.size())
                    .mapToObj(j -> jobs.get(j))
                    .forEach(job -> {
                        int jIndex = jobs.indexOf(job);
                        Recon recon = jIndex < recons.size() ? recons.get(jIndex) : null;
                        JobGroup correspondingGroup = jobToGroup.get(job);
                        List<ReconEntry> entries = correspondingGroup.entries;
                        jobToGroup.remove(job);
                        jobs.remove(jIndex);
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
                    break;
                }
            }
        });