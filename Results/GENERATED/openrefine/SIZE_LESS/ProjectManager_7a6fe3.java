_projectsMetadata.keySet().stream()
    .filter(id -> {
        Project project = _projects.get(id);
        return project != null && !project.getProcessManager().hasPending() && project.getLastSave().isAfter(getProjectMetadata(id).getModified());
    })
    .forEach(id -> _projects.remove(id).dispose());