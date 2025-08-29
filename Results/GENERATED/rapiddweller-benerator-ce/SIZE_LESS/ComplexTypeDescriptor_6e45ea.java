parentParts.stream()
    .filter(pcd -> pcd instanceof ComponentDescriptor && !parts.containsName(pcd.getName()))
    .forEach(pcd -> {
        InstanceDescriptor ccd = parts.someValueOfName(pcd.getName());
        result.add(pcd.getName(), Objects.requireNonNullElse(ccd, pcd));
    });