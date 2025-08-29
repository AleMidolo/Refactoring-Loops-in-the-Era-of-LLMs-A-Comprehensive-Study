_entries.stream()
    .map(entry -> _reconConfig.createJob(_project, entry.rowIndex, _project.rows.get(entry.rowIndex), _columnName, entry.cell))
    .map(ReconJob::getStringKey)
    .map(key -> jobKeyToGroup.computeIfAbsent(key, k -> new JobGroup()))
    .forEach(group -> group.entries.addAll(_entries));