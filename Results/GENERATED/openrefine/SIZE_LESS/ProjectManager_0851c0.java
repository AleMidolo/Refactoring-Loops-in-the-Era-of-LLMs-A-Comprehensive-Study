_projectsMetadata.keySet().stream()
    .filter(id -> {
        ProjectMetadata metadata = getProjectMetadata(id);
        Project project = _projects.get(id);
        return project != null && !project.getProcessManager().hasPending() && project.getLastSave().isAfter(metadata.getModified());
    })
    .forEach(id -> _projects.remove(id).dispose());