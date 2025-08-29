for (InstanceDescriptor instance : getParts()) {
    if (instance instanceof ComponentDescriptor) {
        result.add((ComponentDescriptor) instance);
    }
}