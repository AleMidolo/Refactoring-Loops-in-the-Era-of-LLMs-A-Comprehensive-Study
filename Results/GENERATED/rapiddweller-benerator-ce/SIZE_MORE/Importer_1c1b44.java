IntStream.range(0, platformNames.length)
    .forEach(i -> {
        PlatformDescriptor descriptor = descriptors[i];
        String platformName = platformNames[i];
        if (descriptor == null) {
            absentPlatforms.add(platformName);
        } else {
            importPlatformClasses(descriptor, context);
            importedPlatforms.add(platformName);
        }
    });