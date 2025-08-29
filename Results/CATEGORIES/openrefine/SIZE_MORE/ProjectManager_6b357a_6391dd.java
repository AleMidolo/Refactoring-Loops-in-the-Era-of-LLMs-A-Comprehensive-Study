for (long id : _projectsMetadata.keySet()) {
    ProjectMetadata metadata = getProjectMetadata(id);
    Project project = _projects.get(id);
    if (project != null) {
        boolean hasUnsavedChanges = metadata.getModified().isAfter(project.getLastSave()) || metadata.getModified().equals(project.getLastSave());
        if (hasUnsavedChanges) {
            long msecsOverdue = Duration.between(startTimeOfSave, project.getLastSave()).toMillis();
            records.add(new SaveRecord(project, msecsOverdue));
        } else if (!project.getProcessManager().hasPending() && project.getLastSave().plus(PROJECT_FLUSH_DELAY).isBefore(startTimeOfSave)) {
            _projects.remove(id).dispose();
        }
    }
}