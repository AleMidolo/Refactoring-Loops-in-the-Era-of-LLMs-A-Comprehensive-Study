for (int i = 0; i < platforms.length; i++) {
    String platformName = platformNames[i];
    platforms[i] = findDescriptorForPlatform(platformName, required);
}