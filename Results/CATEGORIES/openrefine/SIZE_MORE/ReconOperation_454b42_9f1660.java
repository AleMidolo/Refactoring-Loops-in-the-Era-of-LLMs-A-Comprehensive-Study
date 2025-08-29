for (ReconEntry entry : _entries) {
    ReconJob job = _reconConfig.createJob(_project, entry.rowIndex, _project.rows.get(entry.rowIndex), _columnName, entry.cell);
    String key = job.getStringKey();
    JobGroup group = jobKeyToGroup.get(key);
    if (group == null) {
        group = new JobGroup(job);
        jobKeyToGroup.put(key, group);
    }
    group.entries.add(entry);
}