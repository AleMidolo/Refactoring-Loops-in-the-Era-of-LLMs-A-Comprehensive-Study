for (String pkg : pkgs) {
    PlatformDescriptor result = findDescriptorForPackage(pkg);
    if (result != null) {
        return result;
    }
}