paths.stream()
    .map(path -> resolve(module, path))
    .filter(fullPath -> fullPath != null)
    .filter(fullPath -> !bundle._pathSet.contains(fullPath))
    .forEach(fullPath -> {
        QualifiedPath qualifiedPath = new QualifiedPath();
        qualifiedPath.module = module;
        qualifiedPath.path = paths;
        qualifiedPath.fullPath = fullPath;
        bundle._pathSet.add(fullPath);
        bundle._pathList.add(qualifiedPath);
    });