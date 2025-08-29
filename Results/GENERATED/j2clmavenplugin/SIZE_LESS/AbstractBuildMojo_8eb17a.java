project.getDependencies().stream()
    .forEach(dep -> writeProjectAndDeps(dep.getProject(), depth + 1, seenKeys));