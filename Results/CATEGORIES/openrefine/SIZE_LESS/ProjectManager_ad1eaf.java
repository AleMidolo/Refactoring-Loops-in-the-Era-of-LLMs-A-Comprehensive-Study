for (Project project : _projects.values()) {
    if (project != null) {
        project.dispose();
    }
}