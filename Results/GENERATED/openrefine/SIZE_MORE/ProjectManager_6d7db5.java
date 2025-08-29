_projectsMetadata.keySet().stream()
        .map(this::getProjectMetadata)
        .forEach(metadata -> {
            long id = metadata.getId();
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
        });