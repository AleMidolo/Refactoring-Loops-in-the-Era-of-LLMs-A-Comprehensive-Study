_projectsMetadata.keySet().stream()
        .map(this::getProjectMetadata)
        .filter(metadata -> {
            Project project = _projects.get(metadata.getId());
            return project != null && (metadata.getModified().isAfter(project.getLastSave()) || metadata.getModified().equals(project.getLastSave()));
        })
        .forEach(metadata -> {
            Project project = _projects.get(metadata.getId());
            long msecsOverdue = Duration.between(startTimeOfSave, project.getLastSave()).toMillis();
            records.add(new SaveRecord(project, msecsOverdue));
        });

_projectsMetadata.keySet().stream()
        .filter(id -> {
            Project project = _projects.get(id);
            return project != null && !project.getProcessManager().hasPending() &&
                    project.getLastSave().plus(PROJECT_FLUSH_DELAY).isBefore(startTimeOfSave);
        })
        .forEach(id -> {
            Project project = _projects.remove(id);
            project.dispose();
        });