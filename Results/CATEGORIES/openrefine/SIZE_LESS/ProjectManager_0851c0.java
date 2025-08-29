for (long id : _projectsMetadata.keySet()) {
    ProjectMetadata metadata = getProjectMetadata(id);
    Project project = _projects.get(id);
    if (project != null && !project.getProcessManager().hasPending() && project.getLastSave().isAfter(metadata.getModified())) {
        _projects.remove(id).dispose();
    }
}