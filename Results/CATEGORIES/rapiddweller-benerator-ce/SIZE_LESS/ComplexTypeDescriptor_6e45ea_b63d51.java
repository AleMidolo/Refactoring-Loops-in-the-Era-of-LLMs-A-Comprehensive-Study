for (InstanceDescriptor pcd : parentParts) {
    String name = pcd.getName();
    if (pcd instanceof ComponentDescriptor && !parts.containsName(name)) {
        InstanceDescriptor ccd = parts.someValueOfName(name);
        result.add(name, Objects.requireNonNullElse(ccd, pcd));
    }
}