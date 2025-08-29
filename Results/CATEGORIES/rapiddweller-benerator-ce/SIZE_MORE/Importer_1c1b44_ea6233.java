for (int i = 0; i < platformNames.length; i++) {
    PlatformDescriptor descriptor = descriptors[i];
    String platformName = platformNames[i];
    if (descriptor == null) {
        absentPlatforms.add(platformName);
    } else {
        importPlatformClasses(descriptor, context);
        importedPlatforms.add(platformName);
    }
}