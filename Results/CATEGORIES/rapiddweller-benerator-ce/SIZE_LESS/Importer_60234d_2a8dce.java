for (String pkg : pkgs) {
    DomainDescriptor result = findDomainDescriptorForPackage(pkg);
    if (result != null) {
        return result;
    }
}