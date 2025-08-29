for (ProjectMetadata pm : _projectsMetadata.values()) {
    if (pm.getName().equals(name)) {
        return pm;
    }
}