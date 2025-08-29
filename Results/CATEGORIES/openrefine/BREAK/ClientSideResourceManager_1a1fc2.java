for (String path : paths) {
    String fullPath = resolve(module, path);
    if (fullPath == null) {
        logger.error("Failed to add paths to unmounted module " + module.getName());
        break;
    }
    if (!bundle._pathSet.contains(fullPath)) {
        QualifiedPath qualifiedPath = new QualifiedPath();
        qualifiedPath.module = module;
        qualifiedPath.path = path;
        qualifiedPath.fullPath = fullPath;
        bundle._pathSet.add(fullPath);
        bundle._pathList.add(qualifiedPath);
    }
}