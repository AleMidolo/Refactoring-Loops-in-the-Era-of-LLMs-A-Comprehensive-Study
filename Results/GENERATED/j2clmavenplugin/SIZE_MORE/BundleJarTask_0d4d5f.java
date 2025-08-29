remaining.removeIf(input ->
    input.getProject().getDependencies().stream().noneMatch(dep ->
        pendingProjectKeys.contains(dep.getProject().getKey())
    )
);