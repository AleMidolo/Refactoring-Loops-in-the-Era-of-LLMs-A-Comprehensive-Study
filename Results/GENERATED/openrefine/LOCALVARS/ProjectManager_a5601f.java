_projectsMetadata.entrySet().stream()
    .filter(entry -> {
        ProjectMetadata metadata = entry.getValue();
        return metadata != null && name.equals(metadata.getName());
    })
    .findFirst()
    .ifPresent(entry -> {
        id = entry.getKey();
        count += 1;
    });