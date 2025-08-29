for (Entry<Long, ProjectMetadata> entry : _projectsMetadata.entrySet()) {
    ProjectMetadata metadata = entry.getValue();
    if (metadata != null && name.equals(metadata.getName())) {
        id = entry.getKey();
        count += 1;
    }
}