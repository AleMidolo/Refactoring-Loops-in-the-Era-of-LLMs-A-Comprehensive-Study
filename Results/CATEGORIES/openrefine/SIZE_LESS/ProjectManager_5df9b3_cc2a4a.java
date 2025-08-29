for (Project project : _projects.values()) {
    mergeEmptyUserMetadata(project.getMetadata());
}