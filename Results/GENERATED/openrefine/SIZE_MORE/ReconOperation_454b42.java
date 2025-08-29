_entries.stream()
    .map(entry -> _reconConfig.createJob(_project, entry.rowIndex, _project.rows.get(entry.rowIndex), _columnName, entry.cell))
    .map(ReconJob::getStringKey)
    .forEach(key -> {
        JobGroup group = jobKeyToGroup.get(key);
        if (group == null) {
            group = new JobGroup(job);
            jobKeyToGroup.put(key, group);
        }
        group.entries.add(entry);
    });