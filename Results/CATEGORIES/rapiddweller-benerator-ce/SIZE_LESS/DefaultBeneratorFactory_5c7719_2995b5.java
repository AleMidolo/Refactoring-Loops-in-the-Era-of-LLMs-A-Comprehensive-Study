for (InstanceDescriptor part : parts.values()) {
    if (StringUtil.equalsIgnoreCase(part.getName(), name) && part instanceof ComponentDescriptor) {
        return (ComponentDescriptor) part;
    }
}